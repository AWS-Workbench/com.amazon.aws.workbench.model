/**
 */
package com.amazon.aws.workbench.model.awsworkbench.enums.impl;

import com.amazon.aws.workbench.model.awsworkbench.builders.BuildersPackage;

import com.amazon.aws.workbench.model.awsworkbench.builders.impl.BuildersPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.LangPackage;

import com.amazon.aws.workbench.model.awsworkbench.datatypes.java.lang.impl.LangPackageImpl;

import com.amazon.aws.workbench.model.awsworkbench.enums.DefaultInstanceTenancy;
import com.amazon.aws.workbench.model.awsworkbench.enums.EnumsFactory;
import com.amazon.aws.workbench.model.awsworkbench.enums.EnumsPackage;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumsPackageImpl extends EPackageImpl implements EnumsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum defaultInstanceTenancyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.amazon.aws.workbench.model.awsworkbench.enums.EnumsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnumsPackageImpl() {
		super(eNS_URI, EnumsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EnumsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnumsPackage init() {
		if (isInited)
			return (EnumsPackage) EPackage.Registry.INSTANCE.getEPackage(EnumsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnumsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnumsPackageImpl theEnumsPackage = registeredEnumsPackage instanceof EnumsPackageImpl
				? (EnumsPackageImpl) registeredEnumsPackage
				: new EnumsPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LangPackage.eNS_URI);
		LangPackageImpl theLangPackage = (LangPackageImpl) (registeredPackage instanceof LangPackageImpl
				? registeredPackage
				: LangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BuildersPackage.eNS_URI);
		BuildersPackageImpl theBuildersPackage = (BuildersPackageImpl) (registeredPackage instanceof BuildersPackageImpl
				? registeredPackage
				: BuildersPackage.eINSTANCE);

		// Create package meta-data objects
		theEnumsPackage.createPackageContents();
		theLangPackage.createPackageContents();
		theBuildersPackage.createPackageContents();

		// Initialize created meta-data
		theEnumsPackage.initializePackageContents();
		theLangPackage.initializePackageContents();
		theBuildersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnumsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnumsPackage.eNS_URI, theEnumsPackage);
		return theEnumsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDefaultInstanceTenancy() {
		return defaultInstanceTenancyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnumsFactory getEnumsFactory() {
		return (EnumsFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create enums
		defaultInstanceTenancyEEnum = createEEnum(DEFAULT_INSTANCE_TENANCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.class, "DefaultInstanceTenancy");
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEFAULT);
		addEEnumLiteral(defaultInstanceTenancyEEnum, DefaultInstanceTenancy.DEDICATED);

		// Create resource
		createResource(eNS_URI);
	}

} //EnumsPackageImpl
