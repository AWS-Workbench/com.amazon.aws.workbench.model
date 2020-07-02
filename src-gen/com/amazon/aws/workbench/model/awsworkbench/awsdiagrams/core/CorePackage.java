/**
 */
package com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "default.awsworkbench.awsdiagrams.core";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.AppBuilderImpl <em>App Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.AppBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.CorePackageImpl#getAppBuilder()
	 * @generated
	 */
	int APP_BUILDER = 0;

	/**
	 * The feature id for the '<em><b>Auto Synth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__AUTO_SYNTH = 0;

	/**
	 * The feature id for the '<em><b>Outdir</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__OUTDIR = 1;

	/**
	 * The feature id for the '<em><b>Runtime Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__RUNTIME_INFO = 2;

	/**
	 * The feature id for the '<em><b>Stack Traces</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__STACK_TRACES = 3;

	/**
	 * The feature id for the '<em><b>Tree Metadata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__TREE_METADATA = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__ADDITIONAL_CODE = 8;

	/**
	 * The feature id for the '<em><b>Stackbuilder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER__STACKBUILDER = 9;

	/**
	 * The number of structural features of the '<em>App Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>App Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl <em>Stack Builder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.CorePackageImpl#getStackBuilder()
	 * @generated
	 */
	int STACK_BUILDER = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Stack Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__STACK_NAME = 1;

	/**
	 * The feature id for the '<em><b>Termination Protection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__TERMINATION_PROTECTION = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__ADDITIONAL_CODE = 6;

	/**
	 * The feature id for the '<em><b>Vpcbuilder</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER__VPCBUILDER = 7;

	/**
	 * The number of structural features of the '<em>Stack Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Stack Builder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder <em>App Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder
	 * @generated
	 */
	EClass getAppBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getAutoSynth <em>Auto Synth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Synth</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getAutoSynth()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_AutoSynth();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getOutdir <em>Outdir</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getOutdir()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_Outdir();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getRuntimeInfo <em>Runtime Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getRuntimeInfo()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_RuntimeInfo();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getStackTraces <em>Stack Traces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Traces</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getStackTraces()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_StackTraces();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getTreeMetadata <em>Tree Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Metadata</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getTreeMetadata()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_TreeMetadata();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getGeneratedClassName()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getVarName()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getIdentifier()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getAdditionalCode()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EAttribute getAppBuilder_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getStackbuilder <em>Stackbuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stackbuilder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.AppBuilder#getStackbuilder()
	 * @see #getAppBuilder()
	 * @generated
	 */
	EReference getAppBuilder_Stackbuilder();

	/**
	 * Returns the meta object for class '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder <em>Stack Builder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Builder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder
	 * @generated
	 */
	EClass getStackBuilder();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getDescription()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getStackName <em>Stack Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getStackName()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_StackName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getTerminationProtection <em>Termination Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Protection</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getTerminationProtection()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_TerminationProtection();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getGeneratedClassName()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getVarName()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_VarName();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getIdentifier()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getAdditionalCode()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EAttribute getStackBuilder_AdditionalCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getVpcbuilder <em>Vpcbuilder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vpcbuilder</em>'.
	 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.StackBuilder#getVpcbuilder()
	 * @see #getStackBuilder()
	 * @generated
	 */
	EReference getStackBuilder_Vpcbuilder();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.AppBuilderImpl <em>App Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.AppBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.CorePackageImpl#getAppBuilder()
		 * @generated
		 */
		EClass APP_BUILDER = eINSTANCE.getAppBuilder();

		/**
		 * The meta object literal for the '<em><b>Auto Synth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__AUTO_SYNTH = eINSTANCE.getAppBuilder_AutoSynth();

		/**
		 * The meta object literal for the '<em><b>Outdir</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__OUTDIR = eINSTANCE.getAppBuilder_Outdir();

		/**
		 * The meta object literal for the '<em><b>Runtime Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__RUNTIME_INFO = eINSTANCE.getAppBuilder_RuntimeInfo();

		/**
		 * The meta object literal for the '<em><b>Stack Traces</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__STACK_TRACES = eINSTANCE.getAppBuilder_StackTraces();

		/**
		 * The meta object literal for the '<em><b>Tree Metadata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__TREE_METADATA = eINSTANCE.getAppBuilder_TreeMetadata();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__GENERATED_CLASS_NAME = eINSTANCE.getAppBuilder_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__VAR_NAME = eINSTANCE.getAppBuilder_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__IDENTIFIER = eINSTANCE.getAppBuilder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER__ADDITIONAL_CODE = eINSTANCE.getAppBuilder_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Stackbuilder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP_BUILDER__STACKBUILDER = eINSTANCE.getAppBuilder_Stackbuilder();

		/**
		 * The meta object literal for the '{@link com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl <em>Stack Builder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.StackBuilderImpl
		 * @see com.amazon.aws.workbench.model.awsworkbench.awsdiagrams.core.impl.CorePackageImpl#getStackBuilder()
		 * @generated
		 */
		EClass STACK_BUILDER = eINSTANCE.getStackBuilder();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__DESCRIPTION = eINSTANCE.getStackBuilder_Description();

		/**
		 * The meta object literal for the '<em><b>Stack Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__STACK_NAME = eINSTANCE.getStackBuilder_StackName();

		/**
		 * The meta object literal for the '<em><b>Termination Protection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__TERMINATION_PROTECTION = eINSTANCE.getStackBuilder_TerminationProtection();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__GENERATED_CLASS_NAME = eINSTANCE.getStackBuilder_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__VAR_NAME = eINSTANCE.getStackBuilder_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__IDENTIFIER = eINSTANCE.getStackBuilder_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER__ADDITIONAL_CODE = eINSTANCE.getStackBuilder_AdditionalCode();

		/**
		 * The meta object literal for the '<em><b>Vpcbuilder</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STACK_BUILDER__VPCBUILDER = eINSTANCE.getStackBuilder_Vpcbuilder();

	}

} //CorePackage
