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

package org.eclipse.birt.report.designer.core.model;

import java.util.List;

import org.eclipse.birt.report.designer.util.DEUtil;
import org.eclipse.birt.report.designer.util.MetricUtility;
import org.eclipse.birt.report.model.api.DataSourceHandle;
import org.eclipse.birt.report.model.api.DesignElementHandle;
import org.eclipse.birt.report.model.api.MasterPageHandle;
import org.eclipse.birt.report.model.api.ModuleHandle;

import org.eclipse.birt.report.model.api.SlotHandle;
import org.eclipse.birt.report.model.api.elements.DesignChoiceConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;

/**
 * Adapter class to adapt model handle. This adapter provides convenience
 * methods to GUI requirement ReportDesignHandleAdapter responds to model
 * ModuleHandle
 * 
 *  
 */

public class ReportDesignHandleAdapter extends DesignElementHandleAdapter
{

	public ReportDesignHandleAdapter( ModuleHandle handle )
	{
		this( handle, null );
	}

	/**
	 * Constructor
	 * 
	 * @param handle
	 */
	public ReportDesignHandleAdapter( ModuleHandle handle,
			IModelAdapterHelper mark )
	{
		super( handle, mark );
	}

	/**
	 * Gets the Children iterator. This children relationship is determined by
	 * GUI requirement. This is not the model children relationship.
	 * 
	 * @return Children iterator.
	 */
	public List getChildren( )
	{
		return getReportDesignHandle( ).getBody( ).getContents( );
	}

	/**
	 * Gets all the data source binding to report element.
	 * 
	 * @return
	 */
	public List getDataSources( )
	{
		return getModuleHandle( ).getAllDataSources();
	}

	/**
	 * Gets data source handle binding to report element
	 * 
	 * @param name
	 * @return
	 */
	public DataSourceHandle getDataSourceHandle( String name )
	{
		return getModuleHandle( ).findDataSource( name );
	}

	/**
	 * Provides naming check logic of data source name.
	 * 
	 * @param name
	 * @return
	 */
	public boolean checkDataSourceName( String name )
	{
		return getModuleHandle( ).findDataSource( name ) != null;
	}

	/**
	 * Provides naming check logic of data set name.
	 * 
	 * @param name
	 * @return
	 */
	public boolean checkDataSetName( String name )
	{
		return getModuleHandle( ).findDataSet( name ) != null;
	}

	/**
	 * Sets the ModuleHandle be adapted.
	 * 
	 * @param handle
	 */
	public void setReportDesignHandle( ModuleHandle handle )
	{
		setElementHandle( handle );
	}

	/**
	 * @return the master page instace of Report Design.
	 */
	public MasterPageHandle getMasterPage( )
	{
		return getMasterPage( 0 );
	}

	/**
	 * Gets the master page instace of Report Design with specific position.
	 * 
	 * @param pos
	 * @return handle of masterpage.
	 */
	public MasterPageHandle getMasterPage( int pos )
	{
		SlotHandle masterPages = getModuleHandle( ).getMasterPages( );
		MasterPageHandle masterPage = (MasterPageHandle) masterPages.get( pos );

		return masterPage;
	}

	/**
	 * Get the current master page size.
	 * 
	 * @param handle
	 *            The handle of master page.
	 * @return The current master page size.
	 */
	public Dimension getMasterPageSize( DesignElementHandle handle )
	{
		MasterPageHandle masterPage = (MasterPageHandle) handle;

		Dimension size = null;

		if ( masterPage == null
				|| masterPage.getPageType( )
						.equalsIgnoreCase( DesignChoiceConstants.PAGE_SIZE_US_LETTER ) )
		{
			size = new Dimension( MetricUtility.inchToPixel( 8.5, 11 ).x,
					MetricUtility.inchToPixel( 8.5, 11 ).y );
		}
		else if ( masterPage.getPageType( )
				.equalsIgnoreCase( DesignChoiceConstants.PAGE_SIZE_US_LEGAL ) )
		{
			size = new Dimension( MetricUtility.inchToPixel( 8.5, 14 ).x,
					MetricUtility.inchToPixel( 8.5, 14 ).y );
		}
		else if ( masterPage.getPageType( )
				.equalsIgnoreCase( DesignChoiceConstants.PAGE_SIZE_A4 ) )
		{
			size = new Dimension( MetricUtility.inchToPixel( 8.3, 11.7 ).x,
					MetricUtility.inchToPixel( 8.3, 11.7 ).y );
		}
		else if ( masterPage.getPageType( )
				.equalsIgnoreCase( DesignChoiceConstants.PAGE_SIZE_CUSTOM ) )
		{
			int width = (int) DEUtil.convertoToPixel( masterPage.getWidth( ) );
			int height = (int) DEUtil.convertoToPixel( masterPage.getHeight( ) );
			size = new Dimension( width, height );
		}

		if ( DesignChoiceConstants.PAGE_ORIENTATION_LANDSCAPE.equalsIgnoreCase( masterPage.getOrientation( ) ) )
		{
			size = new Dimension( size.height, size.width );
		}

		return size;

	}

	/**
	 * Get insets of master page.
	 * 
	 * @param handle
	 *            the handle of master page
	 * @return insets
	 */
	public Insets getMasterPageInsets( DesignElementHandle handle )
	{
		MasterPageHandle masterPage = (MasterPageHandle) handle;

		return new Insets( (int) DEUtil.convertoToPixel( masterPage.getTopMargin( ) ),
				(int) DEUtil.convertoToPixel( masterPage.getLeftMargin( ) ),
				(int) DEUtil.convertoToPixel( masterPage.getBottomMargin( ) ),
				(int) DEUtil.convertoToPixel( masterPage.getRightMargin( ) ) );
	}
	
}