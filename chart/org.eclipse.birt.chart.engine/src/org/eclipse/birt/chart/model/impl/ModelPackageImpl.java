/***********************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Actuate Corporation - initial API and implementation
 ***********************************************************************/

package org.eclipse.birt.chart.model.impl;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.ChartWithoutAxes;
import org.eclipse.birt.chart.model.ModelFactory;
import org.eclipse.birt.chart.model.ModelPackage;
import org.eclipse.birt.chart.model.attribute.AttributePackage;
import org.eclipse.birt.chart.model.attribute.impl.AttributePackageImpl;
import org.eclipse.birt.chart.model.component.ComponentPackage;
import org.eclipse.birt.chart.model.component.impl.ComponentPackageImpl;
import org.eclipse.birt.chart.model.data.DataPackage;
import org.eclipse.birt.chart.model.data.impl.DataPackageImpl;
import org.eclipse.birt.chart.model.layout.LayoutPackage;
import org.eclipse.birt.chart.model.layout.impl.LayoutPackageImpl;
import org.eclipse.birt.chart.model.type.TypePackage;
import org.eclipse.birt.chart.model.type.impl.TypePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.eclipse.emf.ecore.xml.type.impl.XMLTypePackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package </b>. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage
{

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass chartEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass chartWithAxesEClass = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private EClass chartWithoutAxesEClass = null;

    /**
     * Creates an instance of the model <b>Package </b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry}by the package package URI value.
     * <p>
     * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
     * performs initialization of the package, or returns the registered package, if one already exists. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.eclipse.birt.chart.model.ModelPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ModelPackageImpl()
    {
        super(eNS_URI, ModelFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package </b> for this model, and for any others upon which it depends.
     * Simple dependencies are satisfied by calling this method on all dependent packages before doing anything else.
     * This method drives initialization for interdependent packages directly, in parallel with this package, itself.
     * <p>
     * Of this package and its interdependencies, all packages which have not yet been registered by their URI values
     * are first created and registered. The packages are then initialized in two steps: meta-model objects for all of
     * the packages are created before any are initialized, since one package's meta-model objects may refer to those of
     * another.
     * <p>
     * Invocation of this method will not affect any packages that have already been initialized. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ModelPackage init()
    {
        if (isInited)
            return (ModelPackage) EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

        // Obtain or create and register package
        ModelPackageImpl theModelPackage = (ModelPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(eNS_URI)
            : new ModelPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackageImpl.init();

        // Obtain or create and register interdependencies
        TypePackageImpl theTypePackage = (TypePackageImpl) (EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(TypePackage.eNS_URI)
            : TypePackageImpl.eINSTANCE);
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl) (EPackage.Registry.INSTANCE
            .getEPackage(ComponentPackage.eNS_URI) instanceof ComponentPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(ComponentPackage.eNS_URI) : ComponentPackageImpl.eINSTANCE);
        DataPackageImpl theDataPackage = (DataPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(DataPackage.eNS_URI)
            : DataPackageImpl.eINSTANCE);
        AttributePackageImpl theAttributePackage = (AttributePackageImpl) (EPackage.Registry.INSTANCE
            .getEPackage(AttributePackage.eNS_URI) instanceof AttributePackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(AttributePackage.eNS_URI) : AttributePackageImpl.eINSTANCE);
        LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl) (EPackage.Registry.INSTANCE
            .getEPackage(LayoutPackage.eNS_URI) instanceof LayoutPackageImpl ? EPackage.Registry.INSTANCE
            .getEPackage(LayoutPackage.eNS_URI) : LayoutPackageImpl.eINSTANCE);

        // Create package meta-data objects
        theModelPackage.createPackageContents();
        theTypePackage.createPackageContents();
        theComponentPackage.createPackageContents();
        theDataPackage.createPackageContents();
        theAttributePackage.createPackageContents();
        theLayoutPackage.createPackageContents();

        // Initialize created meta-data
        theModelPackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theComponentPackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theAttributePackage.initializePackageContents();
        theLayoutPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theModelPackage.freeze();

        return theModelPackage;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getChart()
    {
        return chartEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_Version()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_Type()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_SubType()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getChart_Description()
    {
        return (EReference) chartEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getChart_Block()
    {
        return (EReference) chartEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_Dimension()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_Script()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_Units()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_SeriesThickness()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getChart_SeriesHints()
    {
        return (EReference) chartEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChart_GridColumnCount()
    {
        return (EAttribute) chartEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getChart_ExtendedProperties()
    {
        return (EReference) chartEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getChart_SampleData()
    {
        return (EReference) chartEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getChartWithAxes()
    {
        return chartWithAxesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getChartWithAxes_Axes()
    {
        return (EReference) chartWithAxesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChartWithAxes_Orientation()
    {
        return (EAttribute) chartWithAxesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EAttribute getChartWithAxes_UnitSpacing()
    {
        return (EAttribute) chartWithAxesEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EClass getChartWithoutAxes()
    {
        return chartWithoutAxesEClass;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public EReference getChartWithoutAxes_SeriesDefinitions()
    {
        return (EReference) chartWithoutAxesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public ModelFactory getModelFactory()
    {
        return (ModelFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package. This method is guarded to have no affect on any invocation but
     * its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void createPackageContents()
    {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        chartEClass = createEClass(CHART);
        createEAttribute(chartEClass, CHART__VERSION);
        createEAttribute(chartEClass, CHART__TYPE);
        createEAttribute(chartEClass, CHART__SUB_TYPE);
        createEReference(chartEClass, CHART__DESCRIPTION);
        createEReference(chartEClass, CHART__BLOCK);
        createEAttribute(chartEClass, CHART__DIMENSION);
        createEAttribute(chartEClass, CHART__SCRIPT);
        createEAttribute(chartEClass, CHART__UNITS);
        createEAttribute(chartEClass, CHART__SERIES_THICKNESS);
        createEReference(chartEClass, CHART__SERIES_HINTS);
        createEAttribute(chartEClass, CHART__GRID_COLUMN_COUNT);
        createEReference(chartEClass, CHART__EXTENDED_PROPERTIES);
        createEReference(chartEClass, CHART__SAMPLE_DATA);

        chartWithAxesEClass = createEClass(CHART_WITH_AXES);
        createEReference(chartWithAxesEClass, CHART_WITH_AXES__AXES);
        createEAttribute(chartWithAxesEClass, CHART_WITH_AXES__ORIENTATION);
        createEAttribute(chartWithAxesEClass, CHART_WITH_AXES__UNIT_SPACING);

        chartWithoutAxesEClass = createEClass(CHART_WITHOUT_AXES);
        createEReference(chartWithoutAxesEClass, CHART_WITHOUT_AXES__SERIES_DEFINITIONS);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model. This method is guarded to have no affect on any
     * invocation but its first. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void initializePackageContents()
    {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        XMLTypePackageImpl theXMLTypePackage = (XMLTypePackageImpl) EPackage.Registry.INSTANCE
            .getEPackage(XMLTypePackage.eNS_URI);
        AttributePackageImpl theAttributePackage = (AttributePackageImpl) EPackage.Registry.INSTANCE
            .getEPackage(AttributePackage.eNS_URI);
        LayoutPackageImpl theLayoutPackage = (LayoutPackageImpl) EPackage.Registry.INSTANCE
            .getEPackage(LayoutPackage.eNS_URI);
        DataPackageImpl theDataPackage = (DataPackageImpl) EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
        ComponentPackageImpl theComponentPackage = (ComponentPackageImpl) EPackage.Registry.INSTANCE
            .getEPackage(ComponentPackage.eNS_URI);

        // Add supertypes to classes
        chartWithAxesEClass.getESuperTypes().add(this.getChart());
        chartWithoutAxesEClass.getESuperTypes().add(this.getChart());

        // Initialize classes and features; add operations and parameters
        initEClass(chartEClass, Chart.class, "Chart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getChart_Version(), theXMLTypePackage.getString(), "version", null, 1, 1, Chart.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChart_Type(), theXMLTypePackage.getString(), "type", null, 1, 1, Chart.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChart_SubType(), theXMLTypePackage.getString(), "subType", null, 1, 1, Chart.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChart_Description(), theAttributePackage.getText(), null, "description", null, 0, 1,
            Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChart_Block(), theLayoutPackage.getBlock(), null, "block", null, 1, 1, Chart.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChart_Dimension(), theAttributePackage.getChartDimension(), "dimension", "Two_Dimensional",
            1, 1, Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChart_Script(), theXMLTypePackage.getString(), "script", null, 1, 1, Chart.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChart_Units(), theXMLTypePackage.getString(), "units", null, 0, 1, Chart.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChart_SeriesThickness(), theAttributePackage.getPercentage(), "seriesThickness", null, 0, 1,
            Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEReference(getChart_SeriesHints(), theAttributePackage.getSeriesHint(), null, "seriesHints", null, 0, 1,
            Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChart_GridColumnCount(), theXMLTypePackage.getInt(), "gridColumnCount", null, 1, 1,
            Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEReference(getChart_ExtendedProperties(), theAttributePackage.getExtendedProperty(), null,
            "extendedProperties", null, 1, -1, Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getChart_SampleData(), theDataPackage.getSampleData(), null, "sampleData", null, 0, 1,
            Chart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(chartWithAxesEClass, ChartWithAxes.class, "ChartWithAxes", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getChartWithAxes_Axes(), theComponentPackage.getAxis(), null, "axes", null, 2, -1,
            ChartWithAxes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChartWithAxes_Orientation(), theAttributePackage.getOrientation(), "orientation",
            "Horizontal", 1, 1, ChartWithAxes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
            !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getChartWithAxes_UnitSpacing(), theAttributePackage.getPercentage(), "unitSpacing", null, 1, 1,
            ChartWithAxes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(chartWithoutAxesEClass, ChartWithoutAxes.class, "ChartWithoutAxes", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getChartWithoutAxes_SeriesDefinitions(), theDataPackage.getSeriesDefinition(), null,
            "seriesDefinitions", null, 1, -1, ChartWithoutAxes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
        createExtendedMetaDataAnnotations();
    }

    /**
     * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData </b>. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected void createExtendedMetaDataAnnotations()
    {
        String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
        addAnnotation(chartEClass, source, new String[]
        {
            "name", "Chart", "kind", "elementOnly"
        });
        addAnnotation(getChart_Version(), source, new String[]
        {
            "kind", "element", "name", "Version"
        });
        addAnnotation(getChart_Type(), source, new String[]
        {
            "kind", "element", "name", "Type"
        });
        addAnnotation(getChart_SubType(), source, new String[]
        {
            "kind", "element", "name", "SubType"
        });
        addAnnotation(getChart_Description(), source, new String[]
        {
            "kind", "element", "name", "Description"
        });
        addAnnotation(getChart_Block(), source, new String[]
        {
            "kind", "element", "name", "Block"
        });
        addAnnotation(getChart_Dimension(), source, new String[]
        {
            "kind", "element", "name", "Dimension"
        });
        addAnnotation(getChart_Script(), source, new String[]
        {
            "kind", "element", "name", "Script"
        });
        addAnnotation(getChart_Units(), source, new String[]
        {
            "kind", "element", "name", "Units"
        });
        addAnnotation(getChart_SeriesThickness(), source, new String[]
        {
            "kind", "element", "name", "SeriesThickness"
        });
        addAnnotation(getChart_SeriesHints(), source, new String[]
        {
            "kind", "element", "name", "SeriesHints"
        });
        addAnnotation(getChart_GridColumnCount(), source, new String[]
        {
            "kind", "element", "name", "GridColumnCount"
        });
        addAnnotation(getChart_ExtendedProperties(), source, new String[]
        {
            "kind", "element", "name", "ExtendedProperties"
        });
        addAnnotation(getChart_SampleData(), source, new String[]
        {
            "kind", "element", "name", "SampleData"
        });
        addAnnotation(chartWithAxesEClass, source, new String[]
        {
            "name", "ChartWithAxes", "kind", "elementOnly"
        });
        addAnnotation(getChartWithAxes_Axes(), source, new String[]
        {
            "kind", "element", "name", "Axes"
        });
        addAnnotation(getChartWithAxes_Orientation(), source, new String[]
        {
            "kind", "element", "name", "Orientation"
        });
        addAnnotation(getChartWithAxes_UnitSpacing(), source, new String[]
        {
            "kind", "element", "name", "UnitSpacing"
        });
        addAnnotation(chartWithoutAxesEClass, source, new String[]
        {
            "name", "ChartWithoutAxes", "kind", "elementOnly"
        });
        addAnnotation(getChartWithoutAxes_SeriesDefinitions(), source, new String[]
        {
            "kind", "element", "name", "SeriesDefinitions"
        });
    }

} //ModelPackageImpl
