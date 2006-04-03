/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/
package org.eclipse.birt.data.engine.odi;

import org.eclipse.birt.data.engine.api.IBaseExpression;
import org.eclipse.birt.data.engine.core.DataException;

/**
 * Event handler for ODI layer. In ODI layer, since higher caller sometimes
 * needs to do something in the process of ODI, it can be achieved by creating
 * an instance of IEventHandler, and pass it to the ODI as the paramter of query
 * execution.
 * 
 * Acutally this is the hook put into the lower layer by higher layer. This hook
 * can be used in two ways,
 * 
 * 1: higher layer can register a notification request in the lower layer. So
 * when some specific things happen, higher layer will have opportunity to do
 * some operations.
 * 
 * 2: higher layer can provide some service which is unvailable in lower layer.
 * This service is specific to the higher layer, so lower layer has to use the
 * service provided by the higher layer.
 */
public interface IEventHandler
{
	
	//----------------event notification-----------------------------
	
	/**
	 * The result set transformation can be divided into two phrases, one is for
	 * data set, and the other is for table/list. This function will be called
	 * in the middle of the two phrases.
	 * 
	 * @param resultIterator
	 *            current result iterator in processed
	 */
	void handleEndOfDataSetProcess( IResultIterator resultIterator );
	
	//----------------service definition--------------------------------
	
	/**
	 * 
	 * @param rsObject
	 * @param name
	 * @return the value for the specified column name
	 */
	Object getValue( IResultObject rsObject, int index, String name )
			throws DataException;
	
	/**
	 * Determins whether the index or the columnName is referring to row
	 * position column.
	 * 
	 * @param columnName
	 * @return row[0], row._rowPosition
	 */
	boolean isRowID( int index, String columnName );
	
	/**
	 * Find the expression with the specified name from the column binding
	 * table.
	 * 
	 * @return mapped base expression of the specified name
	 */
	IBaseExpression getBaseExpr( String name );

}
