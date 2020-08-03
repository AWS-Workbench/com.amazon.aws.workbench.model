/**
 */
package core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see core.CoreFactory
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
	String eNS_URI = "AWSWorkbenchSources/default.software.amazon.awscdk.core";

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
	CorePackage eINSTANCE = core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link core.impl.EnvironmentBuilder_coreImpl <em>Environment Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.EnvironmentBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getEnvironmentBuilder_core()
	 * @generated
	 */
	int ENVIRONMENT_BUILDER_CORE = 0;

	/**
	 * The feature id for the '<em><b>Account java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__REGION_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Environment Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Environment Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVIRONMENT_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.ResolveOptionsBuilder_coreImpl <em>Resolve Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ResolveOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getResolveOptionsBuilder_core()
	 * @generated
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE = 1;

	/**
	 * The feature id for the '<em><b>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Scope With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Preparing java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Resolve Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Resolve Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOLVE_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.AssetStagingBuilder_coreImpl <em>Asset Staging Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.AssetStagingBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getAssetStagingBuilder_core()
	 * @generated
	 */
	int ASSET_STAGING_BUILDER_CORE = 2;

	/**
	 * The feature id for the '<em><b>Exclude java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = 1;

	/**
	 * The feature id for the '<em><b>Extra Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Source Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Asset Staging Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Asset Staging Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.NestedStackBuilder_coreImpl <em>Nested Stack Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.NestedStackBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getNestedStackBuilder_core()
	 * @generated
	 */
	int NESTED_STACK_BUILDER_CORE = 3;

	/**
	 * The feature id for the '<em><b>Notification Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Parameters java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Nested Stack Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Nested Stack Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.StackPropsBuilder_coreImpl <em>Stack Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.StackPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getStackPropsBuilder_core()
	 * @generated
	 */
	int STACK_PROPS_BUILDER_CORE = 4;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Env With Environment software amazon awscdk core Environment As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Stack Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Termination Protection java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Stack Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Stack Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.TimeConversionOptionsBuilder_coreImpl <em>Time Conversion Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TimeConversionOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getTimeConversionOptionsBuilder_core()
	 * @generated
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE = 5;

	/**
	 * The feature id for the '<em><b>Integral java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE__INTEGRAL_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Time Conversion Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Time Conversion Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_CONVERSION_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.RemoveTagBuilder_coreImpl <em>Remove Tag Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.RemoveTagBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getRemoveTagBuilder_core()
	 * @generated
	 */
	int REMOVE_TAG_BUILDER_CORE = 6;

	/**
	 * The feature id for the '<em><b>Apply To Launched Instances java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Exclude Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Include Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Priority java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Remove Tag Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Remove Tag Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_TAG_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.TagPropsBuilder_coreImpl <em>Tag Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TagPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getTagPropsBuilder_core()
	 * @generated
	 */
	int TAG_PROPS_BUILDER_CORE = 7;

	/**
	 * The feature id for the '<em><b>Apply To Launched Instances java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Exclude Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Include Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Priority java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Tag Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tag Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl <em>Removal Policy Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.RemovalPolicyOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getRemovalPolicyOptionsBuilder_core()
	 * @generated
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE = 8;

	/**
	 * The feature id for the '<em><b>Apply To Update Replace Policy java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Default Value software amazon awscdk core Removal Policy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Removal Policy Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Removal Policy Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVAL_POLICY_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.DefaultStackSynthesizerBuilder_coreImpl <em>Default Stack Synthesizer Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DefaultStackSynthesizerBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE = 9;

	/**
	 * The feature id for the '<em><b>Asset Publishing External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Asset Publishing Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Cloud Formation Execution Role java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>File Assets Bucket Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Image Assets Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_ = 5;

	/**
	 * The feature id for the '<em><b>Qualifier java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Default Stack Synthesizer Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Default Stack Synthesizer Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.FileAssetLocationBuilder_coreImpl <em>File Asset Location Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FileAssetLocationBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getFileAssetLocationBuilder_core()
	 * @generated
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE = 10;

	/**
	 * The feature id for the '<em><b>Bucket Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Http Url java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Object Key java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>S3 Object Url java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>S3 Url java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>File Asset Location Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>File Asset Location Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_LOCATION_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.FingerprintOptionsBuilder_coreImpl <em>Fingerprint Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FingerprintOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE = 11;

	/**
	 * The feature id for the '<em><b>Extra Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Exclude java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Fingerprint Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Fingerprint Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINGERPRINT_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.LazyListValueOptionsBuilder_coreImpl <em>Lazy List Value Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.LazyListValueOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getLazyListValueOptionsBuilder_core()
	 * @generated
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE = 12;

	/**
	 * The feature id for the '<em><b>Display Hint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Omit Empty java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Lazy List Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Lazy List Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.CustomResourceBuilder_coreImpl <em>Custom Resource Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CustomResourceBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getCustomResourceBuilder_core()
	 * @generated
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE = 13;

	/**
	 * The feature id for the '<em><b>Service Token java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Pascal Case Properties java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Properties java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = 3;

	/**
	 * The feature id for the '<em><b>Resource Type java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Custom Resource Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Custom Resource Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.GetContextKeyOptionsBuilder_coreImpl <em>Get Context Key Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.GetContextKeyOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getGetContextKeyOptionsBuilder_core()
	 * @generated
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE = 14;

	/**
	 * The feature id for the '<em><b>Provider java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Props java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Get Context Key Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Get Context Key Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.ValidationErrorBuilder_coreImpl <em>Validation Error Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ValidationErrorBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getValidationErrorBuilder_core()
	 * @generated
	 */
	int VALIDATION_ERROR_BUILDER_CORE = 15;

	/**
	 * The feature id for the '<em><b>Message java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE__MESSAGE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Source With Construct software amazon awscdk core Construct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE__SOURCE_WITH_CONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_CONSTRUCT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Validation Error Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Validation Error Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ERROR_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.SynthesisOptionsBuilder_coreImpl <em>Synthesis Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.SynthesisOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE = 16;

	/**
	 * The feature id for the '<em><b>Outdir java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Skip Validation java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Synthesis Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Synthesis Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNTHESIS_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.DockerImageAssetLocationBuilder_coreImpl <em>Docker Image Asset Location Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DockerImageAssetLocationBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getDockerImageAssetLocationBuilder_core()
	 * @generated
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE = 17;

	/**
	 * The feature id for the '<em><b>Image Uri java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Docker Image Asset Location Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Docker Image Asset Location Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.FileAssetSourceBuilder_coreImpl <em>File Asset Source Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FileAssetSourceBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getFileAssetSourceBuilder_core()
	 * @generated
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE = 18;

	/**
	 * The feature id for the '<em><b>File Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE__FILE_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Packaging software amazon awscdk core File Asset Packaging </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE__PACKAGING_SOFTWARE_AMAZON_AWSCDK_CORE_FILE_ASSET_PACKAGING_ = 1;

	/**
	 * The feature id for the '<em><b>Source Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>File Asset Source Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>File Asset Source Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_ASSET_SOURCE_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.GetContextValueOptionsBuilder_coreImpl <em>Get Context Value Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.GetContextValueOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE = 19;

	/**
	 * The feature id for the '<em><b>Dummy Value java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_ = 0;

	/**
	 * The feature id for the '<em><b>Provider java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Props java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Get Context Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Get Context Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.BootstraplessSynthesizerBuilder_coreImpl <em>Bootstrapless Synthesizer Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.BootstraplessSynthesizerBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getBootstraplessSynthesizerBuilder_core()
	 * @generated
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE = 20;

	/**
	 * The feature id for the '<em><b>Cloud Formation Execution Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Bootstrapless Synthesizer Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Bootstrapless Synthesizer Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.ArnComponentsBuilder_coreImpl <em>Arn Components Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ArnComponentsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getArnComponentsBuilder_core()
	 * @generated
	 */
	int ARN_COMPONENTS_BUILDER_CORE = 21;

	/**
	 * The feature id for the '<em><b>Resource java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Service java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Account java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Partition java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Region java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Resource Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_ = 5;

	/**
	 * The feature id for the '<em><b>Sep java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Arn Components Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Arn Components Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARN_COMPONENTS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.TagBuilder_coreImpl <em>Tag Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TagBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getTagBuilder_core()
	 * @generated
	 */
	int TAG_BUILDER_CORE = 22;

	/**
	 * The feature id for the '<em><b>Apply To Launched Instances java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Exclude Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Include Resource Types java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Priority java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Tag Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Tag Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.ResourcePropsBuilder_coreImpl <em>Resource Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.ResourcePropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getResourcePropsBuilder_core()
	 * @generated
	 */
	int RESOURCE_PROPS_BUILDER_CORE = 23;

	/**
	 * The feature id for the '<em><b>Physical Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPS_BUILDER_CORE__PHYSICAL_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPS_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPS_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Resource Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPS_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Resource Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.SizeConversionOptionsBuilder_coreImpl <em>Size Conversion Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.SizeConversionOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getSizeConversionOptionsBuilder_core()
	 * @generated
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE = 24;

	/**
	 * The feature id for the '<em><b>Rounding software amazon awscdk core Size Rounding Behavior </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Size Conversion Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Size Conversion Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZE_CONVERSION_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.EncodingOptionsBuilder_coreImpl <em>Encoding Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.EncodingOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getEncodingOptionsBuilder_core()
	 * @generated
	 */
	int ENCODING_OPTIONS_BUILDER_CORE = 25;

	/**
	 * The feature id for the '<em><b>Display Hint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPTIONS_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPTIONS_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Encoding Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Encoding Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCODING_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.FromCloudFormationOptionsBuilder_coreImpl <em>From Cloud Formation Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.FromCloudFormationOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getFromCloudFormationOptionsBuilder_core()
	 * @generated
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE = 26;

	/**
	 * The feature id for the '<em><b>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__FINDER_WITH_ICFN_FINDER_SOFTWARE_AMAZON_AWSCDK_CORE_ICFN_FINDER_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>From Cloud Formation Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>From Cloud Formation Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.StackBuilder_coreImpl <em>Stack Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.StackBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getStackBuilder_core()
	 * @generated
	 */
	int STACK_BUILDER_CORE = 27;

	/**
	 * The feature id for the '<em><b>Description java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Env With Environment software amazon awscdk core Environment As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Stack Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 4;

	/**
	 * The feature id for the '<em><b>Termination Protection java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Stack Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Stack Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STACK_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl <em>Custom Resource Provider Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CustomResourceProviderPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE = 28;

	/**
	 * The feature id for the '<em><b>Code Directory java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Runtime software amazon awscdk core Custom Resource Provider Runtime </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_ = 1;

	/**
	 * The feature id for the '<em><b>Memory Size With Size software amazon awscdk core Size As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Policy Statements java lang Object As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST = 3;

	/**
	 * The feature id for the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Custom Resource Provider Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Custom Resource Provider Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.LazyStringValueOptionsBuilder_coreImpl <em>Lazy String Value Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.LazyStringValueOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getLazyStringValueOptionsBuilder_core()
	 * @generated
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE = 29;

	/**
	 * The feature id for the '<em><b>Display Hint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Lazy String Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Lazy String Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.AppPropsBuilder_coreImpl <em>App Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.AppPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getAppPropsBuilder_core()
	 * @generated
	 */
	int APP_PROPS_BUILDER_CORE = 30;

	/**
	 * The feature id for the '<em><b>Auto Synth java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Context java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Outdir java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Runtime Info java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Stack Traces java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_ = 4;

	/**
	 * The feature id for the '<em><b>Tree Metadata java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>App Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>App Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.DefaultStackSynthesizerPropsBuilder_coreImpl <em>Default Stack Synthesizer Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DefaultStackSynthesizerPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE = 31;

	/**
	 * The feature id for the '<em><b>Asset Publishing External Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Asset Publishing Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Cloud Formation Execution Role java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>File Assets Bucket Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Image Assets Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_ = 5;

	/**
	 * The feature id for the '<em><b>Qualifier java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_ = 6;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME = 8;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 10;

	/**
	 * The number of structural features of the '<em>Default Stack Synthesizer Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Default Stack Synthesizer Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.TagManagerOptionsBuilder_coreImpl <em>Tag Manager Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TagManagerOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getTagManagerOptionsBuilder_core()
	 * @generated
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE = 32;

	/**
	 * The feature id for the '<em><b>Tag Property Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE__TAG_PROPERTY_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Tag Manager Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tag Manager Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl <em>Secrets Manager Secret Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.SecretsManagerSecretOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE = 33;

	/**
	 * The feature id for the '<em><b>Json Field java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Version Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Version Stage java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Secrets Manager Secret Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Secrets Manager Secret Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl <em>Bootstrapless Synthesizer Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getBootstraplessSynthesizerPropsBuilder_core()
	 * @generated
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE = 34;

	/**
	 * The feature id for the '<em><b>Cloud Formation Execution Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Bootstrapless Synthesizer Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Bootstrapless Synthesizer Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.GetContextValueResultBuilder_coreImpl <em>Get Context Value Result Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.GetContextValueResultBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getGetContextValueResultBuilder_core()
	 * @generated
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE = 35;

	/**
	 * The feature id for the '<em><b>Value java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__VALUE_JAVA_LANG_OBJECT_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Get Context Value Result Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Get Context Value Result Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_VALUE_RESULT_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.AppBuilder_coreImpl <em>App Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.AppBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getAppBuilder_core()
	 * @generated
	 */
	int APP_BUILDER_CORE = 36;

	/**
	 * The feature id for the '<em><b>Auto Synth java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_ = 0;

	/**
	 * The feature id for the '<em><b>Context java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Outdir java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = 2;

	/**
	 * The feature id for the '<em><b>Runtime Info java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_ = 3;

	/**
	 * The feature id for the '<em><b>Stack Traces java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_ = 4;

	/**
	 * The feature id for the '<em><b>Tree Metadata java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>App Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>App Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.TagManagerBuilder_coreImpl <em>Tag Manager Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.TagManagerBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getTagManagerBuilder_core()
	 * @generated
	 */
	int TAG_MANAGER_BUILDER_CORE = 37;

	/**
	 * The feature id for the '<em><b>Tag Property Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_BUILDER_CORE__TAG_PROPERTY_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_BUILDER_CORE__GENERATED_CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_BUILDER_CORE__VAR_NAME = 2;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_BUILDER_CORE__IDENTIFIER = 3;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_BUILDER_CORE__ADDITIONAL_CODE = 4;

	/**
	 * The number of structural features of the '<em>Tag Manager Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_BUILDER_CORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tag Manager Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_MANAGER_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.LazyAnyValueOptionsBuilder_coreImpl <em>Lazy Any Value Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.LazyAnyValueOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getLazyAnyValueOptionsBuilder_core()
	 * @generated
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE = 38;

	/**
	 * The feature id for the '<em><b>Display Hint java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Omit Empty Array java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_ARRAY_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Lazy Any Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Lazy Any Value Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.DockerImageAssetSourceBuilder_coreImpl <em>Docker Image Asset Source Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DockerImageAssetSourceBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE = 39;

	/**
	 * The feature id for the '<em><b>Directory Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Source Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Docker Build Args java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Docker Build Target java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_ = 3;

	/**
	 * The feature id for the '<em><b>Docker File java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Repository Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_ = 5;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME = 6;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME = 7;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER = 8;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE = 9;

	/**
	 * The number of structural features of the '<em>Docker Image Asset Source Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Docker Image Asset Source Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.NestedStackPropsBuilder_coreImpl <em>Nested Stack Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.NestedStackPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getNestedStackPropsBuilder_core()
	 * @generated
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE = 40;

	/**
	 * The feature id for the '<em><b>Notification Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Parameters java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 3;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME = 4;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER = 5;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 6;

	/**
	 * The number of structural features of the '<em>Nested Stack Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Nested Stack Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NESTED_STACK_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.GetContextKeyResultBuilder_coreImpl <em>Get Context Key Result Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.GetContextKeyResultBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getGetContextKeyResultBuilder_core()
	 * @generated
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE = 41;

	/**
	 * The feature id for the '<em><b>Key java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Props java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Get Context Key Result Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Get Context Key Result Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CONTEXT_KEY_RESULT_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.AssetStagingPropsBuilder_coreImpl <em>Asset Staging Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.AssetStagingPropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE = 42;

	/**
	 * The feature id for the '<em><b>Source Path java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Extra Hash java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_ = 1;

	/**
	 * The feature id for the '<em><b>Exclude java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = 2;

	/**
	 * The feature id for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = 3;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__VAR_NAME = 5;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__IDENTIFIER = 6;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 7;

	/**
	 * The number of structural features of the '<em>Asset Staging Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Asset Staging Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_STAGING_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.DependencyBuilder_coreImpl <em>Dependency Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.DependencyBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getDependencyBuilder_core()
	 * @generated
	 */
	int DEPENDENCY_BUILDER_CORE = 43;

	/**
	 * The feature id for the '<em><b>Source With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Target With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Dependency Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Dependency Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.CopyOptionsBuilder_coreImpl <em>Copy Options Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CopyOptionsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getCopyOptionsBuilder_core()
	 * @generated
	 */
	int COPY_OPTIONS_BUILDER_CORE = 44;

	/**
	 * The feature id for the '<em><b>Exclude java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = 1;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = 2;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE__VAR_NAME = 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE__IDENTIFIER = 4;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = 5;

	/**
	 * The number of structural features of the '<em>Copy Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Copy Options Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_OPTIONS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.impl.CustomResourcePropsBuilder_coreImpl <em>Custom Resource Props Builder core</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.impl.CustomResourcePropsBuilder_coreImpl
	 * @see core.impl.CorePackageImpl#getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE = 45;

	/**
	 * The feature id for the '<em><b>Service Token java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_ = 0;

	/**
	 * The feature id for the '<em><b>Pascal Case Properties java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_ = 1;

	/**
	 * The feature id for the '<em><b>Properties java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = 2;

	/**
	 * The feature id for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = 3;

	/**
	 * The feature id for the '<em><b>Resource Type java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_ = 4;

	/**
	 * The feature id for the '<em><b>Generated Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__VAR_NAME = 6;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__IDENTIFIER = 7;

	/**
	 * The feature id for the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE__ADDITIONAL_CODE = 8;

	/**
	 * The number of structural features of the '<em>Custom Resource Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Custom Resource Props Builder core</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_RESOURCE_PROPS_BUILDER_CORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link core.FileAssetPackaging <em>File Asset Packaging</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.FileAssetPackaging
	 * @see core.impl.CorePackageImpl#getFileAssetPackaging()
	 * @generated
	 */
	int FILE_ASSET_PACKAGING = 46;

	/**
	 * The meta object id for the '{@link core.CfnDynamicReferenceService <em>Cfn Dynamic Reference Service</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.CfnDynamicReferenceService
	 * @see core.impl.CorePackageImpl#getCfnDynamicReferenceService()
	 * @generated
	 */
	int CFN_DYNAMIC_REFERENCE_SERVICE = 47;

	/**
	 * The meta object id for the '{@link core.TagType <em>Tag Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.TagType
	 * @see core.impl.CorePackageImpl#getTagType()
	 * @generated
	 */
	int TAG_TYPE = 48;

	/**
	 * The meta object id for the '{@link core.RemovalPolicy <em>Removal Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.RemovalPolicy
	 * @see core.impl.CorePackageImpl#getRemovalPolicy()
	 * @generated
	 */
	int REMOVAL_POLICY = 49;

	/**
	 * The meta object id for the '{@link core.SizeRoundingBehavior <em>Size Rounding Behavior</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.SizeRoundingBehavior
	 * @see core.impl.CorePackageImpl#getSizeRoundingBehavior()
	 * @generated
	 */
	int SIZE_ROUNDING_BEHAVIOR = 50;

	/**
	 * The meta object id for the '{@link core.CfnCapabilities <em>Cfn Capabilities</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.CfnCapabilities
	 * @see core.impl.CorePackageImpl#getCfnCapabilities()
	 * @generated
	 */
	int CFN_CAPABILITIES = 51;

	/**
	 * The meta object id for the '{@link core.ConstructOrder <em>Construct Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.ConstructOrder
	 * @see core.impl.CorePackageImpl#getConstructOrder()
	 * @generated
	 */
	int CONSTRUCT_ORDER = 52;

	/**
	 * The meta object id for the '{@link core.CustomResourceProviderRuntime <em>Custom Resource Provider Runtime</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.CustomResourceProviderRuntime
	 * @see core.impl.CorePackageImpl#getCustomResourceProviderRuntime()
	 * @generated
	 */
	int CUSTOM_RESOURCE_PROVIDER_RUNTIME = 53;

	/**
	 * The meta object id for the '{@link core.CfnDeletionPolicy <em>Cfn Deletion Policy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.CfnDeletionPolicy
	 * @see core.impl.CorePackageImpl#getCfnDeletionPolicy()
	 * @generated
	 */
	int CFN_DELETION_POLICY = 54;

	/**
	 * The meta object id for the '{@link core.SymlinkFollowMode <em>Symlink Follow Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see core.SymlinkFollowMode
	 * @see core.impl.CorePackageImpl#getSymlinkFollowMode()
	 * @generated
	 */
	int SYMLINK_FOLLOW_MODE = 55;

	/**
	 * Returns the meta object for class '{@link core.EnvironmentBuilder_core <em>Environment Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Environment Builder core</em>'.
	 * @see core.EnvironmentBuilder_core
	 * @generated
	 */
	EClass getEnvironmentBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.EnvironmentBuilder_core#getAccount_java_lang_String_ <em>Account java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account java lang String </em>'.
	 * @see core.EnvironmentBuilder_core#getAccount_java_lang_String_()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_Account_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.EnvironmentBuilder_core#getRegion_java_lang_String_ <em>Region java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region java lang String </em>'.
	 * @see core.EnvironmentBuilder_core#getRegion_java_lang_String_()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_Region_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.EnvironmentBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.EnvironmentBuilder_core#getGeneratedClassName()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.EnvironmentBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.EnvironmentBuilder_core#getVarName()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.EnvironmentBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.EnvironmentBuilder_core#getIdentifier()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.EnvironmentBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.EnvironmentBuilder_core#getAdditionalCode()
	 * @see #getEnvironmentBuilder_core()
	 * @generated
	 */
	EAttribute getEnvironmentBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.ResolveOptionsBuilder_core <em>Resolve Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resolve Options Builder core</em>'.
	 * @see core.ResolveOptionsBuilder_core
	 * @generated
	 */
	EClass getResolveOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.ResolveOptionsBuilder_core#getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference <em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</em>'.
	 * @see core.ResolveOptionsBuilder_core#getResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference()
	 * @see #getResolveOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getResolveOptionsBuilder_core_ResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.ResolveOptionsBuilder_core#getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope With IConstruct software amazon awscdk core IConstruct As Reference</em>'.
	 * @see core.ResolveOptionsBuilder_core#getScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @see #getResolveOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getResolveOptionsBuilder_core_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.ResolveOptionsBuilder_core#getPreparing_java_lang_Boolean_ <em>Preparing java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preparing java lang Boolean </em>'.
	 * @see core.ResolveOptionsBuilder_core#getPreparing_java_lang_Boolean_()
	 * @see #getResolveOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getResolveOptionsBuilder_core_Preparing_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.ResolveOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.ResolveOptionsBuilder_core#getGeneratedClassName()
	 * @see #getResolveOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getResolveOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.ResolveOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.ResolveOptionsBuilder_core#getVarName()
	 * @see #getResolveOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getResolveOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.ResolveOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.ResolveOptionsBuilder_core#getIdentifier()
	 * @see #getResolveOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getResolveOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.ResolveOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.ResolveOptionsBuilder_core#getAdditionalCode()
	 * @see #getResolveOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getResolveOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.AssetStagingBuilder_core <em>Asset Staging Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Staging Builder core</em>'.
	 * @see core.AssetStagingBuilder_core
	 * @generated
	 */
	EClass getAssetStagingBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude java lang String As List</em>'.
	 * @see core.AssetStagingBuilder_core#getExclude_java_lang_String_AsList()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_Exclude_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_ <em>Follow software amazon awscdk core Symlink Follow Mode </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Follow software amazon awscdk core Symlink Follow Mode </em>'.
	 * @see core.AssetStagingBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getExtraHash_java_lang_String_ <em>Extra Hash java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Hash java lang String </em>'.
	 * @see core.AssetStagingBuilder_core#getExtraHash_java_lang_String_()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_ExtraHash_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getSourcePath_java_lang_String_ <em>Source Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Path java lang String </em>'.
	 * @see core.AssetStagingBuilder_core#getSourcePath_java_lang_String_()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_SourcePath_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.AssetStagingBuilder_core#getGeneratedClassName()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.AssetStagingBuilder_core#getVarName()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.AssetStagingBuilder_core#getIdentifier()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.AssetStagingBuilder_core#getAdditionalCode()
	 * @see #getAssetStagingBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.NestedStackBuilder_core <em>Nested Stack Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Stack Builder core</em>'.
	 * @see core.NestedStackBuilder_core
	 * @generated
	 */
	EClass getNestedStackBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackBuilder_core#getNotificationArns_java_lang_String_AsList <em>Notification Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Arns java lang String As List</em>'.
	 * @see core.NestedStackBuilder_core#getNotificationArns_java_lang_String_AsList()
	 * @see #getNestedStackBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackBuilder_core_NotificationArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackBuilder_core#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters java lang String java lang String As Map</em>'.
	 * @see core.NestedStackBuilder_core#getParameters_java_lang_String__java_lang_String_AsMap()
	 * @see #getNestedStackBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see core.NestedStackBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getNestedStackBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.NestedStackBuilder_core#getGeneratedClassName()
	 * @see #getNestedStackBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.NestedStackBuilder_core#getVarName()
	 * @see #getNestedStackBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.NestedStackBuilder_core#getIdentifier()
	 * @see #getNestedStackBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.NestedStackBuilder_core#getAdditionalCode()
	 * @see #getNestedStackBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.StackPropsBuilder_core <em>Stack Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Props Builder core</em>'.
	 * @see core.StackPropsBuilder_core
	 * @generated
	 */
	EClass getStackPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see core.StackPropsBuilder_core#getDescription_java_lang_String_()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference <em>Env With Environment software amazon awscdk core Environment As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env With Environment software amazon awscdk core Environment As Reference</em>'.
	 * @see core.StackPropsBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getStackName_java_lang_String_ <em>Stack Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Name java lang String </em>'.
	 * @see core.StackPropsBuilder_core#getStackName_java_lang_String_()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_StackName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>'.
	 * @see core.StackPropsBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags java lang String java lang String As Map</em>'.
	 * @see core.StackPropsBuilder_core#getTags_java_lang_String__java_lang_String_AsMap()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_Tags_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getTerminationProtection_java_lang_Boolean_ <em>Termination Protection java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Protection java lang Boolean </em>'.
	 * @see core.StackPropsBuilder_core#getTerminationProtection_java_lang_Boolean_()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_TerminationProtection_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.StackPropsBuilder_core#getGeneratedClassName()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.StackPropsBuilder_core#getVarName()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.StackPropsBuilder_core#getIdentifier()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.StackPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.StackPropsBuilder_core#getAdditionalCode()
	 * @see #getStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getStackPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.TimeConversionOptionsBuilder_core <em>Time Conversion Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Conversion Options Builder core</em>'.
	 * @see core.TimeConversionOptionsBuilder_core
	 * @generated
	 */
	EClass getTimeConversionOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.TimeConversionOptionsBuilder_core#getIntegral_java_lang_Boolean_ <em>Integral java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integral java lang Boolean </em>'.
	 * @see core.TimeConversionOptionsBuilder_core#getIntegral_java_lang_Boolean_()
	 * @see #getTimeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTimeConversionOptionsBuilder_core_Integral_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.TimeConversionOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.TimeConversionOptionsBuilder_core#getGeneratedClassName()
	 * @see #getTimeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTimeConversionOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.TimeConversionOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.TimeConversionOptionsBuilder_core#getVarName()
	 * @see #getTimeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTimeConversionOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.TimeConversionOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.TimeConversionOptionsBuilder_core#getIdentifier()
	 * @see #getTimeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTimeConversionOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.TimeConversionOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.TimeConversionOptionsBuilder_core#getAdditionalCode()
	 * @see #getTimeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTimeConversionOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.RemoveTagBuilder_core <em>Remove Tag Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Tag Builder core</em>'.
	 * @see core.RemoveTagBuilder_core
	 * @generated
	 */
	EClass getRemoveTagBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_ <em>Apply To Launched Instances java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Launched Instances java lang Boolean </em>'.
	 * @see core.RemoveTagBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getExcludeResourceTypes_java_lang_String_AsList <em>Exclude Resource Types java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Resource Types java lang String As List</em>'.
	 * @see core.RemoveTagBuilder_core#getExcludeResourceTypes_java_lang_String_AsList()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getIncludeResourceTypes_java_lang_String_AsList <em>Include Resource Types java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Resource Types java lang String As List</em>'.
	 * @see core.RemoveTagBuilder_core#getIncludeResourceTypes_java_lang_String_AsList()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getPriority_java_lang_Number_ <em>Priority java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority java lang Number </em>'.
	 * @see core.RemoveTagBuilder_core#getPriority_java_lang_Number_()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_Priority_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.RemoveTagBuilder_core#getGeneratedClassName()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.RemoveTagBuilder_core#getVarName()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.RemoveTagBuilder_core#getIdentifier()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.RemoveTagBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.RemoveTagBuilder_core#getAdditionalCode()
	 * @see #getRemoveTagBuilder_core()
	 * @generated
	 */
	EAttribute getRemoveTagBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.TagPropsBuilder_core <em>Tag Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Props Builder core</em>'.
	 * @see core.TagPropsBuilder_core
	 * @generated
	 */
	EClass getTagPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_ <em>Apply To Launched Instances java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Launched Instances java lang Boolean </em>'.
	 * @see core.TagPropsBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getExcludeResourceTypes_java_lang_String_AsList <em>Exclude Resource Types java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Resource Types java lang String As List</em>'.
	 * @see core.TagPropsBuilder_core#getExcludeResourceTypes_java_lang_String_AsList()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_ExcludeResourceTypes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getIncludeResourceTypes_java_lang_String_AsList <em>Include Resource Types java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Resource Types java lang String As List</em>'.
	 * @see core.TagPropsBuilder_core#getIncludeResourceTypes_java_lang_String_AsList()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_IncludeResourceTypes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getPriority_java_lang_Number_ <em>Priority java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority java lang Number </em>'.
	 * @see core.TagPropsBuilder_core#getPriority_java_lang_Number_()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_Priority_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.TagPropsBuilder_core#getGeneratedClassName()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.TagPropsBuilder_core#getVarName()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.TagPropsBuilder_core#getIdentifier()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.TagPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.TagPropsBuilder_core#getAdditionalCode()
	 * @see #getTagPropsBuilder_core()
	 * @generated
	 */
	EAttribute getTagPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.RemovalPolicyOptionsBuilder_core <em>Removal Policy Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Removal Policy Options Builder core</em>'.
	 * @see core.RemovalPolicyOptionsBuilder_core
	 * @generated
	 */
	EClass getRemovalPolicyOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.RemovalPolicyOptionsBuilder_core#getApplyToUpdateReplacePolicy_java_lang_Boolean_ <em>Apply To Update Replace Policy java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Update Replace Policy java lang Boolean </em>'.
	 * @see core.RemovalPolicyOptionsBuilder_core#getApplyToUpdateReplacePolicy_java_lang_Boolean_()
	 * @see #getRemovalPolicyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getRemovalPolicyOptionsBuilder_core_ApplyToUpdateReplacePolicy_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.RemovalPolicyOptionsBuilder_core#getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_ <em>Default Value software amazon awscdk core Removal Policy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value software amazon awscdk core Removal Policy </em>'.
	 * @see core.RemovalPolicyOptionsBuilder_core#getDefaultValue_software_amazon_awscdk_core_RemovalPolicy_()
	 * @see #getRemovalPolicyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getRemovalPolicyOptionsBuilder_core_DefaultValue_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Returns the meta object for the attribute '{@link core.RemovalPolicyOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.RemovalPolicyOptionsBuilder_core#getGeneratedClassName()
	 * @see #getRemovalPolicyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getRemovalPolicyOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.RemovalPolicyOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.RemovalPolicyOptionsBuilder_core#getVarName()
	 * @see #getRemovalPolicyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getRemovalPolicyOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.RemovalPolicyOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.RemovalPolicyOptionsBuilder_core#getIdentifier()
	 * @see #getRemovalPolicyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getRemovalPolicyOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.RemovalPolicyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.RemovalPolicyOptionsBuilder_core#getAdditionalCode()
	 * @see #getRemovalPolicyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getRemovalPolicyOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.DefaultStackSynthesizerBuilder_core <em>Default Stack Synthesizer Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Stack Synthesizer Builder core</em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core
	 * @generated
	 */
	EClass getDefaultStackSynthesizerBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getAssetPublishingExternalId_java_lang_String_ <em>Asset Publishing External Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Publishing External Id java lang String </em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getAssetPublishingExternalId_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getAssetPublishingRoleArn_java_lang_String_ <em>Asset Publishing Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Publishing Role Arn java lang String </em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getAssetPublishingRoleArn_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getCloudFormationExecutionRole_java_lang_String_ <em>Cloud Formation Execution Role java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Formation Execution Role java lang String </em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getCloudFormationExecutionRole_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Role Arn java lang String </em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getFileAssetsBucketName_java_lang_String_ <em>File Assets Bucket Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Assets Bucket Name java lang String </em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getFileAssetsBucketName_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getImageAssetsRepositoryName_java_lang_String_ <em>Image Assets Repository Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Assets Repository Name java lang String </em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getImageAssetsRepositoryName_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getQualifier_java_lang_String_ <em>Qualifier java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier java lang String </em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getQualifier_java_lang_String_()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getGeneratedClassName()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getVarName()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getIdentifier()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.DefaultStackSynthesizerBuilder_core#getAdditionalCode()
	 * @see #getDefaultStackSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.FileAssetLocationBuilder_core <em>File Asset Location Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Asset Location Builder core</em>'.
	 * @see core.FileAssetLocationBuilder_core
	 * @generated
	 */
	EClass getFileAssetLocationBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getBucketName_java_lang_String_ <em>Bucket Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bucket Name java lang String </em>'.
	 * @see core.FileAssetLocationBuilder_core#getBucketName_java_lang_String_()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_BucketName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getHttpUrl_java_lang_String_ <em>Http Url java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Http Url java lang String </em>'.
	 * @see core.FileAssetLocationBuilder_core#getHttpUrl_java_lang_String_()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_HttpUrl_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getObjectKey_java_lang_String_ <em>Object Key java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Key java lang String </em>'.
	 * @see core.FileAssetLocationBuilder_core#getObjectKey_java_lang_String_()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_ObjectKey_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getS3ObjectUrl_java_lang_String_ <em>S3 Object Url java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S3 Object Url java lang String </em>'.
	 * @see core.FileAssetLocationBuilder_core#getS3ObjectUrl_java_lang_String_()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_S3ObjectUrl_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getS3Url_java_lang_String_ <em>S3 Url java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>S3 Url java lang String </em>'.
	 * @see core.FileAssetLocationBuilder_core#getS3Url_java_lang_String_()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_S3Url_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.FileAssetLocationBuilder_core#getGeneratedClassName()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.FileAssetLocationBuilder_core#getVarName()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.FileAssetLocationBuilder_core#getIdentifier()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetLocationBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.FileAssetLocationBuilder_core#getAdditionalCode()
	 * @see #getFileAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetLocationBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.FingerprintOptionsBuilder_core <em>Fingerprint Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fingerprint Options Builder core</em>'.
	 * @see core.FingerprintOptionsBuilder_core
	 * @generated
	 */
	EClass getFingerprintOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.FingerprintOptionsBuilder_core#getExtraHash_java_lang_String_ <em>Extra Hash java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Hash java lang String </em>'.
	 * @see core.FingerprintOptionsBuilder_core#getExtraHash_java_lang_String_()
	 * @see #getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFingerprintOptionsBuilder_core_ExtraHash_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FingerprintOptionsBuilder_core#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude java lang String As List</em>'.
	 * @see core.FingerprintOptionsBuilder_core#getExclude_java_lang_String_AsList()
	 * @see #getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFingerprintOptionsBuilder_core_Exclude_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.FingerprintOptionsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_ <em>Follow software amazon awscdk core Symlink Follow Mode </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Follow software amazon awscdk core Symlink Follow Mode </em>'.
	 * @see core.FingerprintOptionsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @see #getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFingerprintOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

	/**
	 * Returns the meta object for the attribute '{@link core.FingerprintOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.FingerprintOptionsBuilder_core#getGeneratedClassName()
	 * @see #getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFingerprintOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.FingerprintOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.FingerprintOptionsBuilder_core#getVarName()
	 * @see #getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFingerprintOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.FingerprintOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.FingerprintOptionsBuilder_core#getIdentifier()
	 * @see #getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFingerprintOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.FingerprintOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.FingerprintOptionsBuilder_core#getAdditionalCode()
	 * @see #getFingerprintOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFingerprintOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.LazyListValueOptionsBuilder_core <em>Lazy List Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy List Value Options Builder core</em>'.
	 * @see core.LazyListValueOptionsBuilder_core
	 * @generated
	 */
	EClass getLazyListValueOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyListValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Hint java lang String </em>'.
	 * @see core.LazyListValueOptionsBuilder_core#getDisplayHint_java_lang_String_()
	 * @see #getLazyListValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyListValueOptionsBuilder_core_DisplayHint_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyListValueOptionsBuilder_core#getOmitEmpty_java_lang_Boolean_ <em>Omit Empty java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Empty java lang Boolean </em>'.
	 * @see core.LazyListValueOptionsBuilder_core#getOmitEmpty_java_lang_Boolean_()
	 * @see #getLazyListValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyListValueOptionsBuilder_core_OmitEmpty_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyListValueOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.LazyListValueOptionsBuilder_core#getGeneratedClassName()
	 * @see #getLazyListValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyListValueOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyListValueOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.LazyListValueOptionsBuilder_core#getVarName()
	 * @see #getLazyListValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyListValueOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyListValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.LazyListValueOptionsBuilder_core#getIdentifier()
	 * @see #getLazyListValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyListValueOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyListValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.LazyListValueOptionsBuilder_core#getAdditionalCode()
	 * @see #getLazyListValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyListValueOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.CustomResourceBuilder_core <em>Custom Resource Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Resource Builder core</em>'.
	 * @see core.CustomResourceBuilder_core
	 * @generated
	 */
	EClass getCustomResourceBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getServiceToken_java_lang_String_ <em>Service Token java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Token java lang String </em>'.
	 * @see core.CustomResourceBuilder_core#getServiceToken_java_lang_String_()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_ServiceToken_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getPascalCaseProperties_java_lang_Boolean_ <em>Pascal Case Properties java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pascal Case Properties java lang Boolean </em>'.
	 * @see core.CustomResourceBuilder_core#getPascalCaseProperties_java_lang_Boolean_()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_PascalCaseProperties_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getProperties_java_lang_String__java_lang_Object_AsMap <em>Properties java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties java lang String java lang Object As Map</em>'.
	 * @see core.CustomResourceBuilder_core#getProperties_java_lang_String__java_lang_Object_AsMap()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Policy software amazon awscdk core Removal Policy </em>'.
	 * @see core.CustomResourceBuilder_core#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getResourceType_java_lang_String_ <em>Resource Type java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type java lang String </em>'.
	 * @see core.CustomResourceBuilder_core#getResourceType_java_lang_String_()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_ResourceType_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.CustomResourceBuilder_core#getGeneratedClassName()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.CustomResourceBuilder_core#getVarName()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.CustomResourceBuilder_core#getIdentifier()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.CustomResourceBuilder_core#getAdditionalCode()
	 * @see #getCustomResourceBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.GetContextKeyOptionsBuilder_core <em>Get Context Key Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Context Key Options Builder core</em>'.
	 * @see core.GetContextKeyOptionsBuilder_core
	 * @generated
	 */
	EClass getGetContextKeyOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyOptionsBuilder_core#getProvider_java_lang_String_ <em>Provider java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider java lang String </em>'.
	 * @see core.GetContextKeyOptionsBuilder_core#getProvider_java_lang_String_()
	 * @see #getGetContextKeyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyOptionsBuilder_core_Provider_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyOptionsBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap <em>Props java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props java lang String java lang Object As Map</em>'.
	 * @see core.GetContextKeyOptionsBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap()
	 * @see #getGetContextKeyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.GetContextKeyOptionsBuilder_core#getGeneratedClassName()
	 * @see #getGetContextKeyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.GetContextKeyOptionsBuilder_core#getVarName()
	 * @see #getGetContextKeyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.GetContextKeyOptionsBuilder_core#getIdentifier()
	 * @see #getGetContextKeyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.GetContextKeyOptionsBuilder_core#getAdditionalCode()
	 * @see #getGetContextKeyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.ValidationErrorBuilder_core <em>Validation Error Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Error Builder core</em>'.
	 * @see core.ValidationErrorBuilder_core
	 * @generated
	 */
	EClass getValidationErrorBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.ValidationErrorBuilder_core#getMessage_java_lang_String_ <em>Message java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message java lang String </em>'.
	 * @see core.ValidationErrorBuilder_core#getMessage_java_lang_String_()
	 * @see #getValidationErrorBuilder_core()
	 * @generated
	 */
	EAttribute getValidationErrorBuilder_core_Message_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ValidationErrorBuilder_core#getSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference <em>Source With Construct software amazon awscdk core Construct As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source With Construct software amazon awscdk core Construct As Reference</em>'.
	 * @see core.ValidationErrorBuilder_core#getSourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference()
	 * @see #getValidationErrorBuilder_core()
	 * @generated
	 */
	EAttribute getValidationErrorBuilder_core_SourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.ValidationErrorBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.ValidationErrorBuilder_core#getGeneratedClassName()
	 * @see #getValidationErrorBuilder_core()
	 * @generated
	 */
	EAttribute getValidationErrorBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.ValidationErrorBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.ValidationErrorBuilder_core#getVarName()
	 * @see #getValidationErrorBuilder_core()
	 * @generated
	 */
	EAttribute getValidationErrorBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.ValidationErrorBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.ValidationErrorBuilder_core#getIdentifier()
	 * @see #getValidationErrorBuilder_core()
	 * @generated
	 */
	EAttribute getValidationErrorBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.ValidationErrorBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.ValidationErrorBuilder_core#getAdditionalCode()
	 * @see #getValidationErrorBuilder_core()
	 * @generated
	 */
	EAttribute getValidationErrorBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.SynthesisOptionsBuilder_core <em>Synthesis Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synthesis Options Builder core</em>'.
	 * @see core.SynthesisOptionsBuilder_core
	 * @generated
	 */
	EClass getSynthesisOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.SynthesisOptionsBuilder_core#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir java lang String </em>'.
	 * @see core.SynthesisOptionsBuilder_core#getOutdir_java_lang_String_()
	 * @see #getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSynthesisOptionsBuilder_core_Outdir_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.SynthesisOptionsBuilder_core#getSkipValidation_java_lang_Boolean_ <em>Skip Validation java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Validation java lang Boolean </em>'.
	 * @see core.SynthesisOptionsBuilder_core#getSkipValidation_java_lang_Boolean_()
	 * @see #getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSynthesisOptionsBuilder_core_SkipValidation_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.SynthesisOptionsBuilder_core#getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference <em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</em>'.
	 * @see core.SynthesisOptionsBuilder_core#getRuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference()
	 * @see #getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSynthesisOptionsBuilder_core_RuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.SynthesisOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.SynthesisOptionsBuilder_core#getGeneratedClassName()
	 * @see #getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSynthesisOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.SynthesisOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.SynthesisOptionsBuilder_core#getVarName()
	 * @see #getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSynthesisOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.SynthesisOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.SynthesisOptionsBuilder_core#getIdentifier()
	 * @see #getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSynthesisOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.SynthesisOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.SynthesisOptionsBuilder_core#getAdditionalCode()
	 * @see #getSynthesisOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSynthesisOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.DockerImageAssetLocationBuilder_core <em>Docker Image Asset Location Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Image Asset Location Builder core</em>'.
	 * @see core.DockerImageAssetLocationBuilder_core
	 * @generated
	 */
	EClass getDockerImageAssetLocationBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetLocationBuilder_core#getImageUri_java_lang_String_ <em>Image Uri java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Uri java lang String </em>'.
	 * @see core.DockerImageAssetLocationBuilder_core#getImageUri_java_lang_String_()
	 * @see #getDockerImageAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetLocationBuilder_core_ImageUri_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetLocationBuilder_core#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Name java lang String </em>'.
	 * @see core.DockerImageAssetLocationBuilder_core#getRepositoryName_java_lang_String_()
	 * @see #getDockerImageAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetLocationBuilder_core_RepositoryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetLocationBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.DockerImageAssetLocationBuilder_core#getGeneratedClassName()
	 * @see #getDockerImageAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetLocationBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetLocationBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.DockerImageAssetLocationBuilder_core#getVarName()
	 * @see #getDockerImageAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetLocationBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetLocationBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.DockerImageAssetLocationBuilder_core#getIdentifier()
	 * @see #getDockerImageAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetLocationBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetLocationBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.DockerImageAssetLocationBuilder_core#getAdditionalCode()
	 * @see #getDockerImageAssetLocationBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetLocationBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.FileAssetSourceBuilder_core <em>File Asset Source Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Asset Source Builder core</em>'.
	 * @see core.FileAssetSourceBuilder_core
	 * @generated
	 */
	EClass getFileAssetSourceBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetSourceBuilder_core#getFileName_java_lang_String_ <em>File Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name java lang String </em>'.
	 * @see core.FileAssetSourceBuilder_core#getFileName_java_lang_String_()
	 * @see #getFileAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetSourceBuilder_core_FileName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetSourceBuilder_core#getPackaging_software_amazon_awscdk_core_FileAssetPackaging_ <em>Packaging software amazon awscdk core File Asset Packaging </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Packaging software amazon awscdk core File Asset Packaging </em>'.
	 * @see core.FileAssetSourceBuilder_core#getPackaging_software_amazon_awscdk_core_FileAssetPackaging_()
	 * @see #getFileAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetSourceBuilder_core_Packaging_software_amazon_awscdk_core_FileAssetPackaging_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetSourceBuilder_core#getSourceHash_java_lang_String_ <em>Source Hash java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Hash java lang String </em>'.
	 * @see core.FileAssetSourceBuilder_core#getSourceHash_java_lang_String_()
	 * @see #getFileAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetSourceBuilder_core_SourceHash_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetSourceBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.FileAssetSourceBuilder_core#getGeneratedClassName()
	 * @see #getFileAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetSourceBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetSourceBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.FileAssetSourceBuilder_core#getVarName()
	 * @see #getFileAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetSourceBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetSourceBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.FileAssetSourceBuilder_core#getIdentifier()
	 * @see #getFileAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetSourceBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.FileAssetSourceBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.FileAssetSourceBuilder_core#getAdditionalCode()
	 * @see #getFileAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getFileAssetSourceBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.GetContextValueOptionsBuilder_core <em>Get Context Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Context Value Options Builder core</em>'.
	 * @see core.GetContextValueOptionsBuilder_core
	 * @generated
	 */
	EClass getGetContextValueOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueOptionsBuilder_core#getDummyValue_java_lang_Object_ <em>Dummy Value java lang Object </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dummy Value java lang Object </em>'.
	 * @see core.GetContextValueOptionsBuilder_core#getDummyValue_java_lang_Object_()
	 * @see #getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueOptionsBuilder_core_DummyValue_java_lang_Object_();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueOptionsBuilder_core#getProvider_java_lang_String_ <em>Provider java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Provider java lang String </em>'.
	 * @see core.GetContextValueOptionsBuilder_core#getProvider_java_lang_String_()
	 * @see #getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueOptionsBuilder_core_Provider_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueOptionsBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap <em>Props java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props java lang String java lang Object As Map</em>'.
	 * @see core.GetContextValueOptionsBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap()
	 * @see #getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.GetContextValueOptionsBuilder_core#getGeneratedClassName()
	 * @see #getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.GetContextValueOptionsBuilder_core#getVarName()
	 * @see #getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.GetContextValueOptionsBuilder_core#getIdentifier()
	 * @see #getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.GetContextValueOptionsBuilder_core#getAdditionalCode()
	 * @see #getGetContextValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.BootstraplessSynthesizerBuilder_core <em>Bootstrapless Synthesizer Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bootstrapless Synthesizer Builder core</em>'.
	 * @see core.BootstraplessSynthesizerBuilder_core
	 * @generated
	 */
	EClass getBootstraplessSynthesizerBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerBuilder_core#getCloudFormationExecutionRoleArn_java_lang_String_ <em>Cloud Formation Execution Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Formation Execution Role Arn java lang String </em>'.
	 * @see core.BootstraplessSynthesizerBuilder_core#getCloudFormationExecutionRoleArn_java_lang_String_()
	 * @see #getBootstraplessSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Role Arn java lang String </em>'.
	 * @see core.BootstraplessSynthesizerBuilder_core#getDeployRoleArn_java_lang_String_()
	 * @see #getBootstraplessSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerBuilder_core_DeployRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.BootstraplessSynthesizerBuilder_core#getGeneratedClassName()
	 * @see #getBootstraplessSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.BootstraplessSynthesizerBuilder_core#getVarName()
	 * @see #getBootstraplessSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.BootstraplessSynthesizerBuilder_core#getIdentifier()
	 * @see #getBootstraplessSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.BootstraplessSynthesizerBuilder_core#getAdditionalCode()
	 * @see #getBootstraplessSynthesizerBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.ArnComponentsBuilder_core <em>Arn Components Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arn Components Builder core</em>'.
	 * @see core.ArnComponentsBuilder_core
	 * @generated
	 */
	EClass getArnComponentsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getResource_java_lang_String_ <em>Resource java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource java lang String </em>'.
	 * @see core.ArnComponentsBuilder_core#getResource_java_lang_String_()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_Resource_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getService_java_lang_String_ <em>Service java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service java lang String </em>'.
	 * @see core.ArnComponentsBuilder_core#getService_java_lang_String_()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_Service_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getAccount_java_lang_String_ <em>Account java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account java lang String </em>'.
	 * @see core.ArnComponentsBuilder_core#getAccount_java_lang_String_()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_Account_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getPartition_java_lang_String_ <em>Partition java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Partition java lang String </em>'.
	 * @see core.ArnComponentsBuilder_core#getPartition_java_lang_String_()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_Partition_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getRegion_java_lang_String_ <em>Region java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Region java lang String </em>'.
	 * @see core.ArnComponentsBuilder_core#getRegion_java_lang_String_()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_Region_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getResourceName_java_lang_String_ <em>Resource Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name java lang String </em>'.
	 * @see core.ArnComponentsBuilder_core#getResourceName_java_lang_String_()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_ResourceName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getSep_java_lang_String_ <em>Sep java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sep java lang String </em>'.
	 * @see core.ArnComponentsBuilder_core#getSep_java_lang_String_()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_Sep_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.ArnComponentsBuilder_core#getGeneratedClassName()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.ArnComponentsBuilder_core#getVarName()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.ArnComponentsBuilder_core#getIdentifier()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.ArnComponentsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.ArnComponentsBuilder_core#getAdditionalCode()
	 * @see #getArnComponentsBuilder_core()
	 * @generated
	 */
	EAttribute getArnComponentsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.TagBuilder_core <em>Tag Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Builder core</em>'.
	 * @see core.TagBuilder_core
	 * @generated
	 */
	EClass getTagBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_ <em>Apply To Launched Instances java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apply To Launched Instances java lang Boolean </em>'.
	 * @see core.TagBuilder_core#getApplyToLaunchedInstances_java_lang_Boolean_()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getExcludeResourceTypes_java_lang_String_AsList <em>Exclude Resource Types java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Resource Types java lang String As List</em>'.
	 * @see core.TagBuilder_core#getExcludeResourceTypes_java_lang_String_AsList()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getIncludeResourceTypes_java_lang_String_AsList <em>Include Resource Types java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Resource Types java lang String As List</em>'.
	 * @see core.TagBuilder_core#getIncludeResourceTypes_java_lang_String_AsList()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getPriority_java_lang_Number_ <em>Priority java lang Number </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority java lang Number </em>'.
	 * @see core.TagBuilder_core#getPriority_java_lang_Number_()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_Priority_java_lang_Number_();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.TagBuilder_core#getGeneratedClassName()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.TagBuilder_core#getVarName()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.TagBuilder_core#getIdentifier()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.TagBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.TagBuilder_core#getAdditionalCode()
	 * @see #getTagBuilder_core()
	 * @generated
	 */
	EAttribute getTagBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.ResourcePropsBuilder_core <em>Resource Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Props Builder core</em>'.
	 * @see core.ResourcePropsBuilder_core
	 * @generated
	 */
	EClass getResourcePropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.ResourcePropsBuilder_core#getPhysicalName_java_lang_String_ <em>Physical Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Physical Name java lang String </em>'.
	 * @see core.ResourcePropsBuilder_core#getPhysicalName_java_lang_String_()
	 * @see #getResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getResourcePropsBuilder_core_PhysicalName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.ResourcePropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.ResourcePropsBuilder_core#getGeneratedClassName()
	 * @see #getResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getResourcePropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.ResourcePropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.ResourcePropsBuilder_core#getVarName()
	 * @see #getResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getResourcePropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.ResourcePropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.ResourcePropsBuilder_core#getIdentifier()
	 * @see #getResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getResourcePropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.ResourcePropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.ResourcePropsBuilder_core#getAdditionalCode()
	 * @see #getResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getResourcePropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.SizeConversionOptionsBuilder_core <em>Size Conversion Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Size Conversion Options Builder core</em>'.
	 * @see core.SizeConversionOptionsBuilder_core
	 * @generated
	 */
	EClass getSizeConversionOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.SizeConversionOptionsBuilder_core#getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_ <em>Rounding software amazon awscdk core Size Rounding Behavior </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rounding software amazon awscdk core Size Rounding Behavior </em>'.
	 * @see core.SizeConversionOptionsBuilder_core#getRounding_software_amazon_awscdk_core_SizeRoundingBehavior_()
	 * @see #getSizeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSizeConversionOptionsBuilder_core_Rounding_software_amazon_awscdk_core_SizeRoundingBehavior_();

	/**
	 * Returns the meta object for the attribute '{@link core.SizeConversionOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.SizeConversionOptionsBuilder_core#getGeneratedClassName()
	 * @see #getSizeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSizeConversionOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.SizeConversionOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.SizeConversionOptionsBuilder_core#getVarName()
	 * @see #getSizeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSizeConversionOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.SizeConversionOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.SizeConversionOptionsBuilder_core#getIdentifier()
	 * @see #getSizeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSizeConversionOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.SizeConversionOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.SizeConversionOptionsBuilder_core#getAdditionalCode()
	 * @see #getSizeConversionOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSizeConversionOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.EncodingOptionsBuilder_core <em>Encoding Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encoding Options Builder core</em>'.
	 * @see core.EncodingOptionsBuilder_core
	 * @generated
	 */
	EClass getEncodingOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.EncodingOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Hint java lang String </em>'.
	 * @see core.EncodingOptionsBuilder_core#getDisplayHint_java_lang_String_()
	 * @see #getEncodingOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getEncodingOptionsBuilder_core_DisplayHint_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.EncodingOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.EncodingOptionsBuilder_core#getGeneratedClassName()
	 * @see #getEncodingOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getEncodingOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.EncodingOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.EncodingOptionsBuilder_core#getVarName()
	 * @see #getEncodingOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getEncodingOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.EncodingOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.EncodingOptionsBuilder_core#getIdentifier()
	 * @see #getEncodingOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getEncodingOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.EncodingOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.EncodingOptionsBuilder_core#getAdditionalCode()
	 * @see #getEncodingOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getEncodingOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.FromCloudFormationOptionsBuilder_core <em>From Cloud Formation Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Cloud Formation Options Builder core</em>'.
	 * @see core.FromCloudFormationOptionsBuilder_core
	 * @generated
	 */
	EClass getFromCloudFormationOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.FromCloudFormationOptionsBuilder_core#getFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference <em>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</em>'.
	 * @see core.FromCloudFormationOptionsBuilder_core#getFinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference()
	 * @see #getFromCloudFormationOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFromCloudFormationOptionsBuilder_core_FinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.FromCloudFormationOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.FromCloudFormationOptionsBuilder_core#getGeneratedClassName()
	 * @see #getFromCloudFormationOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFromCloudFormationOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.FromCloudFormationOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.FromCloudFormationOptionsBuilder_core#getVarName()
	 * @see #getFromCloudFormationOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFromCloudFormationOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.FromCloudFormationOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.FromCloudFormationOptionsBuilder_core#getIdentifier()
	 * @see #getFromCloudFormationOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFromCloudFormationOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.FromCloudFormationOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.FromCloudFormationOptionsBuilder_core#getAdditionalCode()
	 * @see #getFromCloudFormationOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getFromCloudFormationOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.StackBuilder_core <em>Stack Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stack Builder core</em>'.
	 * @see core.StackBuilder_core
	 * @generated
	 */
	EClass getStackBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getDescription_java_lang_String_ <em>Description java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description java lang String </em>'.
	 * @see core.StackBuilder_core#getDescription_java_lang_String_()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_Description_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference <em>Env With Environment software amazon awscdk core Environment As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Env With Environment software amazon awscdk core Environment As Reference</em>'.
	 * @see core.StackBuilder_core#getEnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getStackName_java_lang_String_ <em>Stack Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Name java lang String </em>'.
	 * @see core.StackBuilder_core#getStackName_java_lang_String_()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_StackName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference <em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</em>'.
	 * @see core.StackBuilder_core#getSynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getTags_java_lang_String__java_lang_String_AsMap <em>Tags java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tags java lang String java lang String As Map</em>'.
	 * @see core.StackBuilder_core#getTags_java_lang_String__java_lang_String_AsMap()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getTerminationProtection_java_lang_Boolean_ <em>Termination Protection java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termination Protection java lang Boolean </em>'.
	 * @see core.StackBuilder_core#getTerminationProtection_java_lang_Boolean_()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_TerminationProtection_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.StackBuilder_core#getGeneratedClassName()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.StackBuilder_core#getVarName()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.StackBuilder_core#getIdentifier()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.StackBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.StackBuilder_core#getAdditionalCode()
	 * @see #getStackBuilder_core()
	 * @generated
	 */
	EAttribute getStackBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.CustomResourceProviderPropsBuilder_core <em>Custom Resource Provider Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Resource Provider Props Builder core</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core
	 * @generated
	 */
	EClass getCustomResourceProviderPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getCodeDirectory_java_lang_String_ <em>Code Directory java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Directory java lang String </em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getCodeDirectory_java_lang_String_()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_CodeDirectory_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_ <em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime software amazon awscdk core Custom Resource Provider Runtime </em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getRuntime_software_amazon_awscdk_core_CustomResourceProviderRuntime_()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_Runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference <em>Memory Size With Size software amazon awscdk core Size As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Size With Size software amazon awscdk core Size As Reference</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getMemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_MemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getPolicyStatements_java_lang_Object_AsList <em>Policy Statements java lang Object As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Policy Statements java lang Object As List</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getPolicyStatements_java_lang_Object_AsList()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_PolicyStatements_java_lang_Object_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getGeneratedClassName()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getVarName()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getIdentifier()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourceProviderPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.CustomResourceProviderPropsBuilder_core#getAdditionalCode()
	 * @see #getCustomResourceProviderPropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourceProviderPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.LazyStringValueOptionsBuilder_core <em>Lazy String Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy String Value Options Builder core</em>'.
	 * @see core.LazyStringValueOptionsBuilder_core
	 * @generated
	 */
	EClass getLazyStringValueOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyStringValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Hint java lang String </em>'.
	 * @see core.LazyStringValueOptionsBuilder_core#getDisplayHint_java_lang_String_()
	 * @see #getLazyStringValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyStringValueOptionsBuilder_core_DisplayHint_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyStringValueOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.LazyStringValueOptionsBuilder_core#getGeneratedClassName()
	 * @see #getLazyStringValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyStringValueOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyStringValueOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.LazyStringValueOptionsBuilder_core#getVarName()
	 * @see #getLazyStringValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyStringValueOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyStringValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.LazyStringValueOptionsBuilder_core#getIdentifier()
	 * @see #getLazyStringValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyStringValueOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyStringValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.LazyStringValueOptionsBuilder_core#getAdditionalCode()
	 * @see #getLazyStringValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyStringValueOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.AppPropsBuilder_core <em>App Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Props Builder core</em>'.
	 * @see core.AppPropsBuilder_core
	 * @generated
	 */
	EClass getAppPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getAutoSynth_java_lang_Boolean_ <em>Auto Synth java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Synth java lang Boolean </em>'.
	 * @see core.AppPropsBuilder_core#getAutoSynth_java_lang_Boolean_()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_AutoSynth_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getContext_java_lang_String__java_lang_String_AsMap <em>Context java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context java lang String java lang String As Map</em>'.
	 * @see core.AppPropsBuilder_core#getContext_java_lang_String__java_lang_String_AsMap()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_Context_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir java lang String </em>'.
	 * @see core.AppPropsBuilder_core#getOutdir_java_lang_String_()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_Outdir_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getRuntimeInfo_java_lang_Boolean_ <em>Runtime Info java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info java lang Boolean </em>'.
	 * @see core.AppPropsBuilder_core#getRuntimeInfo_java_lang_Boolean_()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_RuntimeInfo_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getStackTraces_java_lang_Boolean_ <em>Stack Traces java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Traces java lang Boolean </em>'.
	 * @see core.AppPropsBuilder_core#getStackTraces_java_lang_Boolean_()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_StackTraces_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getTreeMetadata_java_lang_Boolean_ <em>Tree Metadata java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Metadata java lang Boolean </em>'.
	 * @see core.AppPropsBuilder_core#getTreeMetadata_java_lang_Boolean_()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_TreeMetadata_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.AppPropsBuilder_core#getGeneratedClassName()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.AppPropsBuilder_core#getVarName()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.AppPropsBuilder_core#getIdentifier()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.AppPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.AppPropsBuilder_core#getAdditionalCode()
	 * @see #getAppPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAppPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.DefaultStackSynthesizerPropsBuilder_core <em>Default Stack Synthesizer Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Stack Synthesizer Props Builder core</em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core
	 * @generated
	 */
	EClass getDefaultStackSynthesizerPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getAssetPublishingExternalId_java_lang_String_ <em>Asset Publishing External Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Publishing External Id java lang String </em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getAssetPublishingExternalId_java_lang_String_()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingExternalId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getAssetPublishingRoleArn_java_lang_String_ <em>Asset Publishing Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Asset Publishing Role Arn java lang String </em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getAssetPublishingRoleArn_java_lang_String_()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getCloudFormationExecutionRole_java_lang_String_ <em>Cloud Formation Execution Role java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Formation Execution Role java lang String </em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getCloudFormationExecutionRole_java_lang_String_()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_CloudFormationExecutionRole_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Role Arn java lang String </em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getDeployRoleArn_java_lang_String_()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getFileAssetsBucketName_java_lang_String_ <em>File Assets Bucket Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Assets Bucket Name java lang String </em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getFileAssetsBucketName_java_lang_String_()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_FileAssetsBucketName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getImageAssetsRepositoryName_java_lang_String_ <em>Image Assets Repository Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Assets Repository Name java lang String </em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getImageAssetsRepositoryName_java_lang_String_()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_ImageAssetsRepositoryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getQualifier_java_lang_String_ <em>Qualifier java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualifier java lang String </em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getQualifier_java_lang_String_()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_Qualifier_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getGeneratedClassName()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getVarName()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getIdentifier()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.DefaultStackSynthesizerPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.DefaultStackSynthesizerPropsBuilder_core#getAdditionalCode()
	 * @see #getDefaultStackSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getDefaultStackSynthesizerPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.TagManagerOptionsBuilder_core <em>Tag Manager Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Manager Options Builder core</em>'.
	 * @see core.TagManagerOptionsBuilder_core
	 * @generated
	 */
	EClass getTagManagerOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerOptionsBuilder_core#getTagPropertyName_java_lang_String_ <em>Tag Property Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Property Name java lang String </em>'.
	 * @see core.TagManagerOptionsBuilder_core#getTagPropertyName_java_lang_String_()
	 * @see #getTagManagerOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerOptionsBuilder_core_TagPropertyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.TagManagerOptionsBuilder_core#getGeneratedClassName()
	 * @see #getTagManagerOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.TagManagerOptionsBuilder_core#getVarName()
	 * @see #getTagManagerOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.TagManagerOptionsBuilder_core#getIdentifier()
	 * @see #getTagManagerOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.TagManagerOptionsBuilder_core#getAdditionalCode()
	 * @see #getTagManagerOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.SecretsManagerSecretOptionsBuilder_core <em>Secrets Manager Secret Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secrets Manager Secret Options Builder core</em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core
	 * @generated
	 */
	EClass getSecretsManagerSecretOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.SecretsManagerSecretOptionsBuilder_core#getJsonField_java_lang_String_ <em>Json Field java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Json Field java lang String </em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core#getJsonField_java_lang_String_()
	 * @see #getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSecretsManagerSecretOptionsBuilder_core_JsonField_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.SecretsManagerSecretOptionsBuilder_core#getVersionId_java_lang_String_ <em>Version Id java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Id java lang String </em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core#getVersionId_java_lang_String_()
	 * @see #getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSecretsManagerSecretOptionsBuilder_core_VersionId_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.SecretsManagerSecretOptionsBuilder_core#getVersionStage_java_lang_String_ <em>Version Stage java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version Stage java lang String </em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core#getVersionStage_java_lang_String_()
	 * @see #getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSecretsManagerSecretOptionsBuilder_core_VersionStage_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.SecretsManagerSecretOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core#getGeneratedClassName()
	 * @see #getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSecretsManagerSecretOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.SecretsManagerSecretOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core#getVarName()
	 * @see #getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSecretsManagerSecretOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.SecretsManagerSecretOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core#getIdentifier()
	 * @see #getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSecretsManagerSecretOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.SecretsManagerSecretOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.SecretsManagerSecretOptionsBuilder_core#getAdditionalCode()
	 * @see #getSecretsManagerSecretOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getSecretsManagerSecretOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.BootstraplessSynthesizerPropsBuilder_core <em>Bootstrapless Synthesizer Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bootstrapless Synthesizer Props Builder core</em>'.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core
	 * @generated
	 */
	EClass getBootstraplessSynthesizerPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerPropsBuilder_core#getCloudFormationExecutionRoleArn_java_lang_String_ <em>Cloud Formation Execution Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cloud Formation Execution Role Arn java lang String </em>'.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core#getCloudFormationExecutionRoleArn_java_lang_String_()
	 * @see #getBootstraplessSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerPropsBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerPropsBuilder_core#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deploy Role Arn java lang String </em>'.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core#getDeployRoleArn_java_lang_String_()
	 * @see #getBootstraplessSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core#getGeneratedClassName()
	 * @see #getBootstraplessSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core#getVarName()
	 * @see #getBootstraplessSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core#getIdentifier()
	 * @see #getBootstraplessSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.BootstraplessSynthesizerPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.BootstraplessSynthesizerPropsBuilder_core#getAdditionalCode()
	 * @see #getBootstraplessSynthesizerPropsBuilder_core()
	 * @generated
	 */
	EAttribute getBootstraplessSynthesizerPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.GetContextValueResultBuilder_core <em>Get Context Value Result Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Context Value Result Builder core</em>'.
	 * @see core.GetContextValueResultBuilder_core
	 * @generated
	 */
	EClass getGetContextValueResultBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueResultBuilder_core#getValue_java_lang_Object_ <em>Value java lang Object </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value java lang Object </em>'.
	 * @see core.GetContextValueResultBuilder_core#getValue_java_lang_Object_()
	 * @see #getGetContextValueResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueResultBuilder_core_Value_java_lang_Object_();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueResultBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.GetContextValueResultBuilder_core#getGeneratedClassName()
	 * @see #getGetContextValueResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueResultBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueResultBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.GetContextValueResultBuilder_core#getVarName()
	 * @see #getGetContextValueResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueResultBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueResultBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.GetContextValueResultBuilder_core#getIdentifier()
	 * @see #getGetContextValueResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueResultBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextValueResultBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.GetContextValueResultBuilder_core#getAdditionalCode()
	 * @see #getGetContextValueResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextValueResultBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.AppBuilder_core <em>App Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Builder core</em>'.
	 * @see core.AppBuilder_core
	 * @generated
	 */
	EClass getAppBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getAutoSynth_java_lang_Boolean_ <em>Auto Synth java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Synth java lang Boolean </em>'.
	 * @see core.AppBuilder_core#getAutoSynth_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_AutoSynth_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getContext_java_lang_String__java_lang_String_AsMap <em>Context java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context java lang String java lang String As Map</em>'.
	 * @see core.AppBuilder_core#getContext_java_lang_String__java_lang_String_AsMap()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getOutdir_java_lang_String_ <em>Outdir java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outdir java lang String </em>'.
	 * @see core.AppBuilder_core#getOutdir_java_lang_String_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_Outdir_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getRuntimeInfo_java_lang_Boolean_ <em>Runtime Info java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Runtime Info java lang Boolean </em>'.
	 * @see core.AppBuilder_core#getRuntimeInfo_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_RuntimeInfo_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getStackTraces_java_lang_Boolean_ <em>Stack Traces java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stack Traces java lang Boolean </em>'.
	 * @see core.AppBuilder_core#getStackTraces_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_StackTraces_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getTreeMetadata_java_lang_Boolean_ <em>Tree Metadata java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tree Metadata java lang Boolean </em>'.
	 * @see core.AppBuilder_core#getTreeMetadata_java_lang_Boolean_()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_TreeMetadata_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.AppBuilder_core#getGeneratedClassName()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.AppBuilder_core#getVarName()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.AppBuilder_core#getIdentifier()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.AppBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.AppBuilder_core#getAdditionalCode()
	 * @see #getAppBuilder_core()
	 * @generated
	 */
	EAttribute getAppBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.TagManagerBuilder_core <em>Tag Manager Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag Manager Builder core</em>'.
	 * @see core.TagManagerBuilder_core
	 * @generated
	 */
	EClass getTagManagerBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerBuilder_core#getTagPropertyName_java_lang_String_ <em>Tag Property Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag Property Name java lang String </em>'.
	 * @see core.TagManagerBuilder_core#getTagPropertyName_java_lang_String_()
	 * @see #getTagManagerBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerBuilder_core_TagPropertyName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.TagManagerBuilder_core#getGeneratedClassName()
	 * @see #getTagManagerBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.TagManagerBuilder_core#getVarName()
	 * @see #getTagManagerBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.TagManagerBuilder_core#getIdentifier()
	 * @see #getTagManagerBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.TagManagerBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.TagManagerBuilder_core#getAdditionalCode()
	 * @see #getTagManagerBuilder_core()
	 * @generated
	 */
	EAttribute getTagManagerBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.LazyAnyValueOptionsBuilder_core <em>Lazy Any Value Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lazy Any Value Options Builder core</em>'.
	 * @see core.LazyAnyValueOptionsBuilder_core
	 * @generated
	 */
	EClass getLazyAnyValueOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyAnyValueOptionsBuilder_core#getDisplayHint_java_lang_String_ <em>Display Hint java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Hint java lang String </em>'.
	 * @see core.LazyAnyValueOptionsBuilder_core#getDisplayHint_java_lang_String_()
	 * @see #getLazyAnyValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyAnyValueOptionsBuilder_core_DisplayHint_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyAnyValueOptionsBuilder_core#getOmitEmptyArray_java_lang_Boolean_ <em>Omit Empty Array java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Omit Empty Array java lang Boolean </em>'.
	 * @see core.LazyAnyValueOptionsBuilder_core#getOmitEmptyArray_java_lang_Boolean_()
	 * @see #getLazyAnyValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyAnyValueOptionsBuilder_core_OmitEmptyArray_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyAnyValueOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.LazyAnyValueOptionsBuilder_core#getGeneratedClassName()
	 * @see #getLazyAnyValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyAnyValueOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyAnyValueOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.LazyAnyValueOptionsBuilder_core#getVarName()
	 * @see #getLazyAnyValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyAnyValueOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyAnyValueOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.LazyAnyValueOptionsBuilder_core#getIdentifier()
	 * @see #getLazyAnyValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyAnyValueOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.LazyAnyValueOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.LazyAnyValueOptionsBuilder_core#getAdditionalCode()
	 * @see #getLazyAnyValueOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getLazyAnyValueOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.DockerImageAssetSourceBuilder_core <em>Docker Image Asset Source Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Docker Image Asset Source Builder core</em>'.
	 * @see core.DockerImageAssetSourceBuilder_core
	 * @generated
	 */
	EClass getDockerImageAssetSourceBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getDirectoryName_java_lang_String_ <em>Directory Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory Name java lang String </em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getDirectoryName_java_lang_String_()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_DirectoryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getSourceHash_java_lang_String_ <em>Source Hash java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Hash java lang String </em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getSourceHash_java_lang_String_()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_SourceHash_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getDockerBuildArgs_java_lang_String__java_lang_String_AsMap <em>Docker Build Args java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Build Args java lang String java lang String As Map</em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getDockerBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_DockerBuildArgs_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getDockerBuildTarget_java_lang_String_ <em>Docker Build Target java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker Build Target java lang String </em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getDockerBuildTarget_java_lang_String_()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_DockerBuildTarget_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getDockerFile_java_lang_String_ <em>Docker File java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Docker File java lang String </em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getDockerFile_java_lang_String_()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_DockerFile_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repository Name java lang String </em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getRepositoryName_java_lang_String_()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_RepositoryName_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getGeneratedClassName()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getVarName()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getIdentifier()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.DockerImageAssetSourceBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.DockerImageAssetSourceBuilder_core#getAdditionalCode()
	 * @see #getDockerImageAssetSourceBuilder_core()
	 * @generated
	 */
	EAttribute getDockerImageAssetSourceBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.NestedStackPropsBuilder_core <em>Nested Stack Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nested Stack Props Builder core</em>'.
	 * @see core.NestedStackPropsBuilder_core
	 * @generated
	 */
	EClass getNestedStackPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackPropsBuilder_core#getNotificationArns_java_lang_String_AsList <em>Notification Arns java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notification Arns java lang String As List</em>'.
	 * @see core.NestedStackPropsBuilder_core#getNotificationArns_java_lang_String_AsList()
	 * @see #getNestedStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackPropsBuilder_core_NotificationArns_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackPropsBuilder_core#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameters java lang String java lang String As Map</em>'.
	 * @see core.NestedStackPropsBuilder_core#getParameters_java_lang_String__java_lang_String_AsMap()
	 * @see #getNestedStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackPropsBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackPropsBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>'.
	 * @see core.NestedStackPropsBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @see #getNestedStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.NestedStackPropsBuilder_core#getGeneratedClassName()
	 * @see #getNestedStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.NestedStackPropsBuilder_core#getVarName()
	 * @see #getNestedStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.NestedStackPropsBuilder_core#getIdentifier()
	 * @see #getNestedStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.NestedStackPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.NestedStackPropsBuilder_core#getAdditionalCode()
	 * @see #getNestedStackPropsBuilder_core()
	 * @generated
	 */
	EAttribute getNestedStackPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.GetContextKeyResultBuilder_core <em>Get Context Key Result Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Context Key Result Builder core</em>'.
	 * @see core.GetContextKeyResultBuilder_core
	 * @generated
	 */
	EClass getGetContextKeyResultBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyResultBuilder_core#getKey_java_lang_String_ <em>Key java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key java lang String </em>'.
	 * @see core.GetContextKeyResultBuilder_core#getKey_java_lang_String_()
	 * @see #getGetContextKeyResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyResultBuilder_core_Key_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyResultBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap <em>Props java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Props java lang String java lang Object As Map</em>'.
	 * @see core.GetContextKeyResultBuilder_core#getProps_java_lang_String__java_lang_Object_AsMap()
	 * @see #getGetContextKeyResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyResultBuilder_core_Props_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyResultBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.GetContextKeyResultBuilder_core#getGeneratedClassName()
	 * @see #getGetContextKeyResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyResultBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyResultBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.GetContextKeyResultBuilder_core#getVarName()
	 * @see #getGetContextKeyResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyResultBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyResultBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.GetContextKeyResultBuilder_core#getIdentifier()
	 * @see #getGetContextKeyResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyResultBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.GetContextKeyResultBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.GetContextKeyResultBuilder_core#getAdditionalCode()
	 * @see #getGetContextKeyResultBuilder_core()
	 * @generated
	 */
	EAttribute getGetContextKeyResultBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.AssetStagingPropsBuilder_core <em>Asset Staging Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Staging Props Builder core</em>'.
	 * @see core.AssetStagingPropsBuilder_core
	 * @generated
	 */
	EClass getAssetStagingPropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getSourcePath_java_lang_String_ <em>Source Path java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Path java lang String </em>'.
	 * @see core.AssetStagingPropsBuilder_core#getSourcePath_java_lang_String_()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_SourcePath_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getExtraHash_java_lang_String_ <em>Extra Hash java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Hash java lang String </em>'.
	 * @see core.AssetStagingPropsBuilder_core#getExtraHash_java_lang_String_()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_ExtraHash_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude java lang String As List</em>'.
	 * @see core.AssetStagingPropsBuilder_core#getExclude_java_lang_String_AsList()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_Exclude_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_ <em>Follow software amazon awscdk core Symlink Follow Mode </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Follow software amazon awscdk core Symlink Follow Mode </em>'.
	 * @see core.AssetStagingPropsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.AssetStagingPropsBuilder_core#getGeneratedClassName()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.AssetStagingPropsBuilder_core#getVarName()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.AssetStagingPropsBuilder_core#getIdentifier()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.AssetStagingPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.AssetStagingPropsBuilder_core#getAdditionalCode()
	 * @see #getAssetStagingPropsBuilder_core()
	 * @generated
	 */
	EAttribute getAssetStagingPropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.DependencyBuilder_core <em>Dependency Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency Builder core</em>'.
	 * @see core.DependencyBuilder_core
	 * @generated
	 */
	EClass getDependencyBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.DependencyBuilder_core#getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source With IConstruct software amazon awscdk core IConstruct As Reference</em>'.
	 * @see core.DependencyBuilder_core#getSourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @see #getDependencyBuilder_core()
	 * @generated
	 */
	EAttribute getDependencyBuilder_core_SourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.DependencyBuilder_core#getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference <em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target With IConstruct software amazon awscdk core IConstruct As Reference</em>'.
	 * @see core.DependencyBuilder_core#getTargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference()
	 * @see #getDependencyBuilder_core()
	 * @generated
	 */
	EAttribute getDependencyBuilder_core_TargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

	/**
	 * Returns the meta object for the attribute '{@link core.DependencyBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.DependencyBuilder_core#getGeneratedClassName()
	 * @see #getDependencyBuilder_core()
	 * @generated
	 */
	EAttribute getDependencyBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.DependencyBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.DependencyBuilder_core#getVarName()
	 * @see #getDependencyBuilder_core()
	 * @generated
	 */
	EAttribute getDependencyBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.DependencyBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.DependencyBuilder_core#getIdentifier()
	 * @see #getDependencyBuilder_core()
	 * @generated
	 */
	EAttribute getDependencyBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.DependencyBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.DependencyBuilder_core#getAdditionalCode()
	 * @see #getDependencyBuilder_core()
	 * @generated
	 */
	EAttribute getDependencyBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.CopyOptionsBuilder_core <em>Copy Options Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Options Builder core</em>'.
	 * @see core.CopyOptionsBuilder_core
	 * @generated
	 */
	EClass getCopyOptionsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.CopyOptionsBuilder_core#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude java lang String As List</em>'.
	 * @see core.CopyOptionsBuilder_core#getExclude_java_lang_String_AsList()
	 * @see #getCopyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getCopyOptionsBuilder_core_Exclude_java_lang_String_AsList();

	/**
	 * Returns the meta object for the attribute '{@link core.CopyOptionsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_ <em>Follow software amazon awscdk core Symlink Follow Mode </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Follow software amazon awscdk core Symlink Follow Mode </em>'.
	 * @see core.CopyOptionsBuilder_core#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @see #getCopyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getCopyOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

	/**
	 * Returns the meta object for the attribute '{@link core.CopyOptionsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.CopyOptionsBuilder_core#getGeneratedClassName()
	 * @see #getCopyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getCopyOptionsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.CopyOptionsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.CopyOptionsBuilder_core#getVarName()
	 * @see #getCopyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getCopyOptionsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.CopyOptionsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.CopyOptionsBuilder_core#getIdentifier()
	 * @see #getCopyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getCopyOptionsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.CopyOptionsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.CopyOptionsBuilder_core#getAdditionalCode()
	 * @see #getCopyOptionsBuilder_core()
	 * @generated
	 */
	EAttribute getCopyOptionsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for class '{@link core.CustomResourcePropsBuilder_core <em>Custom Resource Props Builder core</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Resource Props Builder core</em>'.
	 * @see core.CustomResourcePropsBuilder_core
	 * @generated
	 */
	EClass getCustomResourcePropsBuilder_core();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getServiceToken_java_lang_String_ <em>Service Token java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Token java lang String </em>'.
	 * @see core.CustomResourcePropsBuilder_core#getServiceToken_java_lang_String_()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_ServiceToken_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getPascalCaseProperties_java_lang_Boolean_ <em>Pascal Case Properties java lang Boolean </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pascal Case Properties java lang Boolean </em>'.
	 * @see core.CustomResourcePropsBuilder_core#getPascalCaseProperties_java_lang_Boolean_()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_PascalCaseProperties_java_lang_Boolean_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getProperties_java_lang_String__java_lang_Object_AsMap <em>Properties java lang String java lang Object As Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties java lang String java lang Object As Map</em>'.
	 * @see core.CustomResourcePropsBuilder_core#getProperties_java_lang_String__java_lang_Object_AsMap()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Removal Policy software amazon awscdk core Removal Policy </em>'.
	 * @see core.CustomResourcePropsBuilder_core#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getResourceType_java_lang_String_ <em>Resource Type java lang String </em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Type java lang String </em>'.
	 * @see core.CustomResourcePropsBuilder_core#getResourceType_java_lang_String_()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_ResourceType_java_lang_String_();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated Class Name</em>'.
	 * @see core.CustomResourcePropsBuilder_core#getGeneratedClassName()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_GeneratedClassName();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see core.CustomResourcePropsBuilder_core#getVarName()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_VarName();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see core.CustomResourcePropsBuilder_core#getIdentifier()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link core.CustomResourcePropsBuilder_core#getAdditionalCode <em>Additional Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Code</em>'.
	 * @see core.CustomResourcePropsBuilder_core#getAdditionalCode()
	 * @see #getCustomResourcePropsBuilder_core()
	 * @generated
	 */
	EAttribute getCustomResourcePropsBuilder_core_AdditionalCode();

	/**
	 * Returns the meta object for enum '{@link core.FileAssetPackaging <em>File Asset Packaging</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>File Asset Packaging</em>'.
	 * @see core.FileAssetPackaging
	 * @generated
	 */
	EEnum getFileAssetPackaging();

	/**
	 * Returns the meta object for enum '{@link core.CfnDynamicReferenceService <em>Cfn Dynamic Reference Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cfn Dynamic Reference Service</em>'.
	 * @see core.CfnDynamicReferenceService
	 * @generated
	 */
	EEnum getCfnDynamicReferenceService();

	/**
	 * Returns the meta object for enum '{@link core.TagType <em>Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tag Type</em>'.
	 * @see core.TagType
	 * @generated
	 */
	EEnum getTagType();

	/**
	 * Returns the meta object for enum '{@link core.RemovalPolicy <em>Removal Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Removal Policy</em>'.
	 * @see core.RemovalPolicy
	 * @generated
	 */
	EEnum getRemovalPolicy();

	/**
	 * Returns the meta object for enum '{@link core.SizeRoundingBehavior <em>Size Rounding Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Size Rounding Behavior</em>'.
	 * @see core.SizeRoundingBehavior
	 * @generated
	 */
	EEnum getSizeRoundingBehavior();

	/**
	 * Returns the meta object for enum '{@link core.CfnCapabilities <em>Cfn Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cfn Capabilities</em>'.
	 * @see core.CfnCapabilities
	 * @generated
	 */
	EEnum getCfnCapabilities();

	/**
	 * Returns the meta object for enum '{@link core.ConstructOrder <em>Construct Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Construct Order</em>'.
	 * @see core.ConstructOrder
	 * @generated
	 */
	EEnum getConstructOrder();

	/**
	 * Returns the meta object for enum '{@link core.CustomResourceProviderRuntime <em>Custom Resource Provider Runtime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Custom Resource Provider Runtime</em>'.
	 * @see core.CustomResourceProviderRuntime
	 * @generated
	 */
	EEnum getCustomResourceProviderRuntime();

	/**
	 * Returns the meta object for enum '{@link core.CfnDeletionPolicy <em>Cfn Deletion Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cfn Deletion Policy</em>'.
	 * @see core.CfnDeletionPolicy
	 * @generated
	 */
	EEnum getCfnDeletionPolicy();

	/**
	 * Returns the meta object for enum '{@link core.SymlinkFollowMode <em>Symlink Follow Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Symlink Follow Mode</em>'.
	 * @see core.SymlinkFollowMode
	 * @generated
	 */
	EEnum getSymlinkFollowMode();

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
		 * The meta object literal for the '{@link core.impl.EnvironmentBuilder_coreImpl <em>Environment Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.EnvironmentBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getEnvironmentBuilder_core()
		 * @generated
		 */
		EClass ENVIRONMENT_BUILDER_CORE = eINSTANCE.getEnvironmentBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Account java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_ = eINSTANCE
				.getEnvironmentBuilder_core_Account_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Region java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__REGION_JAVA_LANG_STRING_ = eINSTANCE
				.getEnvironmentBuilder_core_Region_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getEnvironmentBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__VAR_NAME = eINSTANCE.getEnvironmentBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__IDENTIFIER = eINSTANCE.getEnvironmentBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVIRONMENT_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getEnvironmentBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.ResolveOptionsBuilder_coreImpl <em>Resolve Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ResolveOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getResolveOptionsBuilder_core()
		 * @generated
		 */
		EClass RESOLVE_OPTIONS_BUILDER_CORE = eINSTANCE.getResolveOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Resolver With IToken Resolver software amazon awscdk core IToken Resolver As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OPTIONS_BUILDER_CORE__RESOLVER_WITH_ITOKEN_RESOLVER_SOFTWARE_AMAZON_AWSCDK_CORE_ITOKEN_RESOLVER_AS_REFERENCE = eINSTANCE
				.getResolveOptionsBuilder_core_ResolverWithITokenResolver_software_amazon_awscdk_core_ITokenResolver_AsReference();

		/**
		 * The meta object literal for the '<em><b>Scope With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OPTIONS_BUILDER_CORE__SCOPE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = eINSTANCE
				.getResolveOptionsBuilder_core_ScopeWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

		/**
		 * The meta object literal for the '<em><b>Preparing java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OPTIONS_BUILDER_CORE__PREPARING_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getResolveOptionsBuilder_core_Preparing_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getResolveOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE.getResolveOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getResolveOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOLVE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getResolveOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.AssetStagingBuilder_coreImpl <em>Asset Staging Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.AssetStagingBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getAssetStagingBuilder_core()
		 * @generated
		 */
		EClass ASSET_STAGING_BUILDER_CORE = eINSTANCE.getAssetStagingBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Exclude java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getAssetStagingBuilder_core_Exclude_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = eINSTANCE
				.getAssetStagingBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

		/**
		 * The meta object literal for the '<em><b>Extra Hash java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_ = eINSTANCE
				.getAssetStagingBuilder_core_ExtraHash_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Source Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getAssetStagingBuilder_core_SourcePath_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getAssetStagingBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__VAR_NAME = eINSTANCE.getAssetStagingBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__IDENTIFIER = eINSTANCE.getAssetStagingBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getAssetStagingBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.NestedStackBuilder_coreImpl <em>Nested Stack Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.NestedStackBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getNestedStackBuilder_core()
		 * @generated
		 */
		EClass NESTED_STACK_BUILDER_CORE = eINSTANCE.getNestedStackBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Notification Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getNestedStackBuilder_core_NotificationArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Parameters java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getNestedStackBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getNestedStackBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getNestedStackBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_BUILDER_CORE__VAR_NAME = eINSTANCE.getNestedStackBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_BUILDER_CORE__IDENTIFIER = eINSTANCE.getNestedStackBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getNestedStackBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.StackPropsBuilder_coreImpl <em>Stack Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.StackPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getStackPropsBuilder_core()
		 * @generated
		 */
		EClass STACK_PROPS_BUILDER_CORE = eINSTANCE.getStackPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getStackPropsBuilder_core_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Env With Environment software amazon awscdk core Environment As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE = eINSTANCE
				.getStackPropsBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();

		/**
		 * The meta object literal for the '<em><b>Stack Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getStackPropsBuilder_core_StackName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE = eINSTANCE
				.getStackPropsBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();

		/**
		 * The meta object literal for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getStackPropsBuilder_core_Tags_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Termination Protection java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getStackPropsBuilder_core_TerminationProtection_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getStackPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE.getStackPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getStackPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getStackPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.TimeConversionOptionsBuilder_coreImpl <em>Time Conversion Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TimeConversionOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getTimeConversionOptionsBuilder_core()
		 * @generated
		 */
		EClass TIME_CONVERSION_OPTIONS_BUILDER_CORE = eINSTANCE.getTimeConversionOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Integral java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONVERSION_OPTIONS_BUILDER_CORE__INTEGRAL_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTimeConversionOptionsBuilder_core_Integral_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getTimeConversionOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getTimeConversionOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getTimeConversionOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getTimeConversionOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.RemoveTagBuilder_coreImpl <em>Remove Tag Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.RemoveTagBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getRemoveTagBuilder_core()
		 * @generated
		 */
		EClass REMOVE_TAG_BUILDER_CORE = eINSTANCE.getRemoveTagBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Apply To Launched Instances java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getRemoveTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Exclude Resource Types java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getRemoveTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Include Resource Types java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getRemoveTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Priority java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getRemoveTagBuilder_core_Priority_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getRemoveTagBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__VAR_NAME = eINSTANCE.getRemoveTagBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__IDENTIFIER = eINSTANCE.getRemoveTagBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_TAG_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getRemoveTagBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.TagPropsBuilder_coreImpl <em>Tag Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TagPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getTagPropsBuilder_core()
		 * @generated
		 */
		EClass TAG_PROPS_BUILDER_CORE = eINSTANCE.getTagPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Apply To Launched Instances java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTagPropsBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Exclude Resource Types java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTagPropsBuilder_core_ExcludeResourceTypes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Include Resource Types java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTagPropsBuilder_core_IncludeResourceTypes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Priority java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTagPropsBuilder_core_Priority_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getTagPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE.getTagPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getTagPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getTagPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.RemovalPolicyOptionsBuilder_coreImpl <em>Removal Policy Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.RemovalPolicyOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getRemovalPolicyOptionsBuilder_core()
		 * @generated
		 */
		EClass REMOVAL_POLICY_OPTIONS_BUILDER_CORE = eINSTANCE.getRemovalPolicyOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Apply To Update Replace Policy java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_POLICY_OPTIONS_BUILDER_CORE__APPLY_TO_UPDATE_REPLACE_POLICY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getRemovalPolicyOptionsBuilder_core_ApplyToUpdateReplacePolicy_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Default Value software amazon awscdk core Removal Policy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_POLICY_OPTIONS_BUILDER_CORE__DEFAULT_VALUE_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = eINSTANCE
				.getRemovalPolicyOptionsBuilder_core_DefaultValue_software_amazon_awscdk_core_RemovalPolicy_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_POLICY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getRemovalPolicyOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_POLICY_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getRemovalPolicyOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_POLICY_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getRemovalPolicyOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVAL_POLICY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getRemovalPolicyOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.DefaultStackSynthesizerBuilder_coreImpl <em>Default Stack Synthesizer Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DefaultStackSynthesizerBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getDefaultStackSynthesizerBuilder_core()
		 * @generated
		 */
		EClass DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE = eINSTANCE.getDefaultStackSynthesizerBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Asset Publishing External Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_AssetPublishingExternalId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Asset Publishing Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_AssetPublishingRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cloud Formation Execution Role java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_CloudFormationExecutionRole_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_DeployRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>File Assets Bucket Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_FileAssetsBucketName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Image Assets Repository Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_ImageAssetsRepositoryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Qualifier java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_Qualifier_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getDefaultStackSynthesizerBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.FileAssetLocationBuilder_coreImpl <em>File Asset Location Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FileAssetLocationBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getFileAssetLocationBuilder_core()
		 * @generated
		 */
		EClass FILE_ASSET_LOCATION_BUILDER_CORE = eINSTANCE.getFileAssetLocationBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Bucket Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getFileAssetLocationBuilder_core_BucketName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Http Url java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_ = eINSTANCE
				.getFileAssetLocationBuilder_core_HttpUrl_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Object Key java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_ = eINSTANCE
				.getFileAssetLocationBuilder_core_ObjectKey_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>S3 Object Url java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_ = eINSTANCE
				.getFileAssetLocationBuilder_core_S3ObjectUrl_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>S3 Url java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_ = eINSTANCE
				.getFileAssetLocationBuilder_core_S3Url_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getFileAssetLocationBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME = eINSTANCE.getFileAssetLocationBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getFileAssetLocationBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getFileAssetLocationBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.FingerprintOptionsBuilder_coreImpl <em>Fingerprint Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FingerprintOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getFingerprintOptionsBuilder_core()
		 * @generated
		 */
		EClass FINGERPRINT_OPTIONS_BUILDER_CORE = eINSTANCE.getFingerprintOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Extra Hash java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINGERPRINT_OPTIONS_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_ = eINSTANCE
				.getFingerprintOptionsBuilder_core_ExtraHash_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Exclude java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINGERPRINT_OPTIONS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getFingerprintOptionsBuilder_core_Exclude_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINGERPRINT_OPTIONS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = eINSTANCE
				.getFingerprintOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINGERPRINT_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getFingerprintOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINGERPRINT_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE.getFingerprintOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINGERPRINT_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getFingerprintOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FINGERPRINT_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getFingerprintOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.LazyListValueOptionsBuilder_coreImpl <em>Lazy List Value Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.LazyListValueOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getLazyListValueOptionsBuilder_core()
		 * @generated
		 */
		EClass LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE = eINSTANCE.getLazyListValueOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Display Hint java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyListValueOptionsBuilder_core_DisplayHint_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Omit Empty java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getLazyListValueOptionsBuilder_core_OmitEmpty_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getLazyListValueOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getLazyListValueOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getLazyListValueOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_LIST_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getLazyListValueOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.CustomResourceBuilder_coreImpl <em>Custom Resource Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CustomResourceBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getCustomResourceBuilder_core()
		 * @generated
		 */
		EClass CUSTOM_RESOURCE_BUILDER_CORE = eINSTANCE.getCustomResourceBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Service Token java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_ = eINSTANCE
				.getCustomResourceBuilder_core_ServiceToken_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Pascal Case Properties java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getCustomResourceBuilder_core_PascalCaseProperties_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Properties java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getCustomResourceBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = eINSTANCE
				.getCustomResourceBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

		/**
		 * The meta object literal for the '<em><b>Resource Type java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_ = eINSTANCE
				.getCustomResourceBuilder_core_ResourceType_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getCustomResourceBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__VAR_NAME = eINSTANCE.getCustomResourceBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__IDENTIFIER = eINSTANCE.getCustomResourceBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getCustomResourceBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.GetContextKeyOptionsBuilder_coreImpl <em>Get Context Key Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.GetContextKeyOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getGetContextKeyOptionsBuilder_core()
		 * @generated
		 */
		EClass GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE = eINSTANCE.getGetContextKeyOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Provider java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_ = eINSTANCE
				.getGetContextKeyOptionsBuilder_core_Provider_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Props java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getGetContextKeyOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getGetContextKeyOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getGetContextKeyOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getGetContextKeyOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getGetContextKeyOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.ValidationErrorBuilder_coreImpl <em>Validation Error Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ValidationErrorBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getValidationErrorBuilder_core()
		 * @generated
		 */
		EClass VALIDATION_ERROR_BUILDER_CORE = eINSTANCE.getValidationErrorBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Message java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR_BUILDER_CORE__MESSAGE_JAVA_LANG_STRING_ = eINSTANCE
				.getValidationErrorBuilder_core_Message_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Source With Construct software amazon awscdk core Construct As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR_BUILDER_CORE__SOURCE_WITH_CONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_CONSTRUCT_AS_REFERENCE = eINSTANCE
				.getValidationErrorBuilder_core_SourceWithConstruct_software_amazon_awscdk_core_Construct_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getValidationErrorBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR_BUILDER_CORE__VAR_NAME = eINSTANCE.getValidationErrorBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR_BUILDER_CORE__IDENTIFIER = eINSTANCE.getValidationErrorBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALIDATION_ERROR_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getValidationErrorBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.SynthesisOptionsBuilder_coreImpl <em>Synthesis Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.SynthesisOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getSynthesisOptionsBuilder_core()
		 * @generated
		 */
		EClass SYNTHESIS_OPTIONS_BUILDER_CORE = eINSTANCE.getSynthesisOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Outdir java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIS_OPTIONS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = eINSTANCE
				.getSynthesisOptionsBuilder_core_Outdir_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Skip Validation java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIS_OPTIONS_BUILDER_CORE__SKIP_VALIDATION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getSynthesisOptionsBuilder_core_SkipValidation_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Runtime Info With Runtime Info software amazon awscdk cxapi Runtime Info As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIS_OPTIONS_BUILDER_CORE__RUNTIME_INFO_WITH_RUNTIME_INFO_SOFTWARE_AMAZON_AWSCDK_CXAPI_RUNTIME_INFO_AS_REFERENCE = eINSTANCE
				.getSynthesisOptionsBuilder_core_RuntimeInfoWithRuntimeInfo_software_amazon_awscdk_cxapi_RuntimeInfo_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIS_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getSynthesisOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIS_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE.getSynthesisOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIS_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getSynthesisOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNTHESIS_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getSynthesisOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.DockerImageAssetLocationBuilder_coreImpl <em>Docker Image Asset Location Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DockerImageAssetLocationBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getDockerImageAssetLocationBuilder_core()
		 * @generated
		 */
		EClass DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE = eINSTANCE.getDockerImageAssetLocationBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Image Uri java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_ = eINSTANCE
				.getDockerImageAssetLocationBuilder_core_ImageUri_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Repository Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDockerImageAssetLocationBuilder_core_RepositoryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getDockerImageAssetLocationBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getDockerImageAssetLocationBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getDockerImageAssetLocationBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getDockerImageAssetLocationBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.FileAssetSourceBuilder_coreImpl <em>File Asset Source Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FileAssetSourceBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getFileAssetSourceBuilder_core()
		 * @generated
		 */
		EClass FILE_ASSET_SOURCE_BUILDER_CORE = eINSTANCE.getFileAssetSourceBuilder_core();

		/**
		 * The meta object literal for the '<em><b>File Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_SOURCE_BUILDER_CORE__FILE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getFileAssetSourceBuilder_core_FileName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Packaging software amazon awscdk core File Asset Packaging </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_SOURCE_BUILDER_CORE__PACKAGING_SOFTWARE_AMAZON_AWSCDK_CORE_FILE_ASSET_PACKAGING_ = eINSTANCE
				.getFileAssetSourceBuilder_core_Packaging_software_amazon_awscdk_core_FileAssetPackaging_();

		/**
		 * The meta object literal for the '<em><b>Source Hash java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_ = eINSTANCE
				.getFileAssetSourceBuilder_core_SourceHash_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getFileAssetSourceBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME = eINSTANCE.getFileAssetSourceBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER = eINSTANCE.getFileAssetSourceBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getFileAssetSourceBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.GetContextValueOptionsBuilder_coreImpl <em>Get Context Value Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.GetContextValueOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getGetContextValueOptionsBuilder_core()
		 * @generated
		 */
		EClass GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE = eINSTANCE.getGetContextValueOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Dummy Value java lang Object </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__DUMMY_VALUE_JAVA_LANG_OBJECT_ = eINSTANCE
				.getGetContextValueOptionsBuilder_core_DummyValue_java_lang_Object_();

		/**
		 * The meta object literal for the '<em><b>Provider java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROVIDER_JAVA_LANG_STRING_ = eINSTANCE
				.getGetContextValueOptionsBuilder_core_Provider_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Props java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getGetContextValueOptionsBuilder_core_Props_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getGetContextValueOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getGetContextValueOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getGetContextValueOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getGetContextValueOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.BootstraplessSynthesizerBuilder_coreImpl <em>Bootstrapless Synthesizer Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.BootstraplessSynthesizerBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getBootstraplessSynthesizerBuilder_core()
		 * @generated
		 */
		EClass BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE = eINSTANCE.getBootstraplessSynthesizerBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Cloud Formation Execution Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getBootstraplessSynthesizerBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getBootstraplessSynthesizerBuilder_core_DeployRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getBootstraplessSynthesizerBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getBootstraplessSynthesizerBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getBootstraplessSynthesizerBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getBootstraplessSynthesizerBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.ArnComponentsBuilder_coreImpl <em>Arn Components Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ArnComponentsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getArnComponentsBuilder_core()
		 * @generated
		 */
		EClass ARN_COMPONENTS_BUILDER_CORE = eINSTANCE.getArnComponentsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Resource java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__RESOURCE_JAVA_LANG_STRING_ = eINSTANCE
				.getArnComponentsBuilder_core_Resource_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Service java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__SERVICE_JAVA_LANG_STRING_ = eINSTANCE
				.getArnComponentsBuilder_core_Service_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Account java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__ACCOUNT_JAVA_LANG_STRING_ = eINSTANCE
				.getArnComponentsBuilder_core_Account_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Partition java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__PARTITION_JAVA_LANG_STRING_ = eINSTANCE
				.getArnComponentsBuilder_core_Partition_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Region java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__REGION_JAVA_LANG_STRING_ = eINSTANCE
				.getArnComponentsBuilder_core_Region_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Resource Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__RESOURCE_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getArnComponentsBuilder_core_ResourceName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Sep java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__SEP_JAVA_LANG_STRING_ = eINSTANCE
				.getArnComponentsBuilder_core_Sep_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getArnComponentsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__VAR_NAME = eINSTANCE.getArnComponentsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getArnComponentsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARN_COMPONENTS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getArnComponentsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.TagBuilder_coreImpl <em>Tag Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TagBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getTagBuilder_core()
		 * @generated
		 */
		EClass TAG_BUILDER_CORE = eINSTANCE.getTagBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Apply To Launched Instances java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__APPLY_TO_LAUNCHED_INSTANCES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getTagBuilder_core_ApplyToLaunchedInstances_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Exclude Resource Types java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__EXCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTagBuilder_core_ExcludeResourceTypes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Include Resource Types java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__INCLUDE_RESOURCE_TYPES_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getTagBuilder_core_IncludeResourceTypes_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Priority java lang Number </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__PRIORITY_JAVA_LANG_NUMBER_ = eINSTANCE
				.getTagBuilder_core_Priority_java_lang_Number_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE.getTagBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__VAR_NAME = eINSTANCE.getTagBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__IDENTIFIER = eINSTANCE.getTagBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getTagBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.ResourcePropsBuilder_coreImpl <em>Resource Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.ResourcePropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getResourcePropsBuilder_core()
		 * @generated
		 */
		EClass RESOURCE_PROPS_BUILDER_CORE = eINSTANCE.getResourcePropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Physical Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPS_BUILDER_CORE__PHYSICAL_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getResourcePropsBuilder_core_PhysicalName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getResourcePropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE.getResourcePropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getResourcePropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESOURCE_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getResourcePropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.SizeConversionOptionsBuilder_coreImpl <em>Size Conversion Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.SizeConversionOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getSizeConversionOptionsBuilder_core()
		 * @generated
		 */
		EClass SIZE_CONVERSION_OPTIONS_BUILDER_CORE = eINSTANCE.getSizeConversionOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Rounding software amazon awscdk core Size Rounding Behavior </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ROUNDING_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_ROUNDING_BEHAVIOR_ = eINSTANCE
				.getSizeConversionOptionsBuilder_core_Rounding_software_amazon_awscdk_core_SizeRoundingBehavior_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONVERSION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getSizeConversionOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONVERSION_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getSizeConversionOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONVERSION_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getSizeConversionOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIZE_CONVERSION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getSizeConversionOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.EncodingOptionsBuilder_coreImpl <em>Encoding Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.EncodingOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getEncodingOptionsBuilder_core()
		 * @generated
		 */
		EClass ENCODING_OPTIONS_BUILDER_CORE = eINSTANCE.getEncodingOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Display Hint java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = eINSTANCE
				.getEncodingOptionsBuilder_core_DisplayHint_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getEncodingOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE.getEncodingOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getEncodingOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENCODING_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getEncodingOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.FromCloudFormationOptionsBuilder_coreImpl <em>From Cloud Formation Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.FromCloudFormationOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getFromCloudFormationOptionsBuilder_core()
		 * @generated
		 */
		EClass FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE = eINSTANCE.getFromCloudFormationOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Finder With ICfn Finder software amazon awscdk core ICfn Finder As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__FINDER_WITH_ICFN_FINDER_SOFTWARE_AMAZON_AWSCDK_CORE_ICFN_FINDER_AS_REFERENCE = eINSTANCE
				.getFromCloudFormationOptionsBuilder_core_FinderWithICfnFinder_software_amazon_awscdk_core_ICfnFinder_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getFromCloudFormationOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getFromCloudFormationOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getFromCloudFormationOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_CLOUD_FORMATION_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getFromCloudFormationOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.StackBuilder_coreImpl <em>Stack Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.StackBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getStackBuilder_core()
		 * @generated
		 */
		EClass STACK_BUILDER_CORE = eINSTANCE.getStackBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Description java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__DESCRIPTION_JAVA_LANG_STRING_ = eINSTANCE
				.getStackBuilder_core_Description_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Env With Environment software amazon awscdk core Environment As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__ENV_WITH_ENVIRONMENT_SOFTWARE_AMAZON_AWSCDK_CORE_ENVIRONMENT_AS_REFERENCE = eINSTANCE
				.getStackBuilder_core_EnvWithEnvironment_software_amazon_awscdk_core_Environment_AsReference();

		/**
		 * The meta object literal for the '<em><b>Stack Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__STACK_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getStackBuilder_core_StackName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Synthesizer With IStack Synthesizer software amazon awscdk core IStack Synthesizer As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__SYNTHESIZER_WITH_ISTACK_SYNTHESIZER_SOFTWARE_AMAZON_AWSCDK_CORE_ISTACK_SYNTHESIZER_AS_REFERENCE = eINSTANCE
				.getStackBuilder_core_SynthesizerWithIStackSynthesizer_software_amazon_awscdk_core_IStackSynthesizer_AsReference();

		/**
		 * The meta object literal for the '<em><b>Tags java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__TAGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getStackBuilder_core_Tags_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Termination Protection java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__TERMINATION_PROTECTION_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getStackBuilder_core_TerminationProtection_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE.getStackBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__VAR_NAME = eINSTANCE.getStackBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__IDENTIFIER = eINSTANCE.getStackBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STACK_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getStackBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.CustomResourceProviderPropsBuilder_coreImpl <em>Custom Resource Provider Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CustomResourceProviderPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getCustomResourceProviderPropsBuilder_core()
		 * @generated
		 */
		EClass CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE = eINSTANCE.getCustomResourceProviderPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Code Directory java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__CODE_DIRECTORY_JAVA_LANG_STRING_ = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_CodeDirectory_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Runtime software amazon awscdk core Custom Resource Provider Runtime </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__RUNTIME_SOFTWARE_AMAZON_AWSCDK_CORE_CUSTOM_RESOURCE_PROVIDER_RUNTIME_ = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_Runtime_software_amazon_awscdk_core_CustomResourceProviderRuntime_();

		/**
		 * The meta object literal for the '<em><b>Memory Size With Size software amazon awscdk core Size As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__MEMORY_SIZE_WITH_SIZE_SOFTWARE_AMAZON_AWSCDK_CORE_SIZE_AS_REFERENCE = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_MemorySizeWithSize_software_amazon_awscdk_core_Size_AsReference();

		/**
		 * The meta object literal for the '<em><b>Policy Statements java lang Object As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__POLICY_STATEMENTS_JAVA_LANG_OBJECT_AS_LIST = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_PolicyStatements_java_lang_Object_AsList();

		/**
		 * The meta object literal for the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROVIDER_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getCustomResourceProviderPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.LazyStringValueOptionsBuilder_coreImpl <em>Lazy String Value Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.LazyStringValueOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getLazyStringValueOptionsBuilder_core()
		 * @generated
		 */
		EClass LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE = eINSTANCE.getLazyStringValueOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Display Hint java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyStringValueOptionsBuilder_core_DisplayHint_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getLazyStringValueOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getLazyStringValueOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getLazyStringValueOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_STRING_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getLazyStringValueOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.AppPropsBuilder_coreImpl <em>App Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.AppPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getAppPropsBuilder_core()
		 * @generated
		 */
		EClass APP_PROPS_BUILDER_CORE = eINSTANCE.getAppPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Auto Synth java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppPropsBuilder_core_AutoSynth_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Context java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getAppPropsBuilder_core_Context_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Outdir java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = eINSTANCE
				.getAppPropsBuilder_core_Outdir_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Runtime Info java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppPropsBuilder_core_RuntimeInfo_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Stack Traces java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppPropsBuilder_core_StackTraces_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Tree Metadata java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppPropsBuilder_core_TreeMetadata_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getAppPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE.getAppPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getAppPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getAppPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.DefaultStackSynthesizerPropsBuilder_coreImpl <em>Default Stack Synthesizer Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DefaultStackSynthesizerPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getDefaultStackSynthesizerPropsBuilder_core()
		 * @generated
		 */
		EClass DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE = eINSTANCE.getDefaultStackSynthesizerPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Asset Publishing External Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingExternalId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Asset Publishing Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_AssetPublishingRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Cloud Formation Execution Role java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_CloudFormationExecutionRole_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>File Assets Bucket Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_FileAssetsBucketName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Image Assets Repository Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_ImageAssetsRepositoryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Qualifier java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_ = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_Qualifier_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_STACK_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getDefaultStackSynthesizerPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.TagManagerOptionsBuilder_coreImpl <em>Tag Manager Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TagManagerOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getTagManagerOptionsBuilder_core()
		 * @generated
		 */
		EClass TAG_MANAGER_OPTIONS_BUILDER_CORE = eINSTANCE.getTagManagerOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Tag Property Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_OPTIONS_BUILDER_CORE__TAG_PROPERTY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getTagManagerOptionsBuilder_core_TagPropertyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getTagManagerOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE.getTagManagerOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getTagManagerOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getTagManagerOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.SecretsManagerSecretOptionsBuilder_coreImpl <em>Secrets Manager Secret Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.SecretsManagerSecretOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getSecretsManagerSecretOptionsBuilder_core()
		 * @generated
		 */
		EClass SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE = eINSTANCE.getSecretsManagerSecretOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Json Field java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__JSON_FIELD_JAVA_LANG_STRING_ = eINSTANCE
				.getSecretsManagerSecretOptionsBuilder_core_JsonField_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Version Id java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_ID_JAVA_LANG_STRING_ = eINSTANCE
				.getSecretsManagerSecretOptionsBuilder_core_VersionId_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Version Stage java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VERSION_STAGE_JAVA_LANG_STRING_ = eINSTANCE
				.getSecretsManagerSecretOptionsBuilder_core_VersionStage_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getSecretsManagerSecretOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getSecretsManagerSecretOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getSecretsManagerSecretOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECRETS_MANAGER_SECRET_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getSecretsManagerSecretOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl <em>Bootstrapless Synthesizer Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.BootstraplessSynthesizerPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getBootstraplessSynthesizerPropsBuilder_core()
		 * @generated
		 */
		EClass BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE = eINSTANCE.getBootstraplessSynthesizerPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Cloud Formation Execution Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getBootstraplessSynthesizerPropsBuilder_core_CloudFormationExecutionRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Deploy Role Arn java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_ = eINSTANCE
				.getBootstraplessSynthesizerPropsBuilder_core_DeployRoleArn_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getBootstraplessSynthesizerPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getBootstraplessSynthesizerPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getBootstraplessSynthesizerPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOTSTRAPLESS_SYNTHESIZER_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getBootstraplessSynthesizerPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.GetContextValueResultBuilder_coreImpl <em>Get Context Value Result Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.GetContextValueResultBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getGetContextValueResultBuilder_core()
		 * @generated
		 */
		EClass GET_CONTEXT_VALUE_RESULT_BUILDER_CORE = eINSTANCE.getGetContextValueResultBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Value java lang Object </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__VALUE_JAVA_LANG_OBJECT_ = eINSTANCE
				.getGetContextValueResultBuilder_core_Value_java_lang_Object_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getGetContextValueResultBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getGetContextValueResultBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getGetContextValueResultBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_VALUE_RESULT_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getGetContextValueResultBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.AppBuilder_coreImpl <em>App Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.AppBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getAppBuilder_core()
		 * @generated
		 */
		EClass APP_BUILDER_CORE = eINSTANCE.getAppBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Auto Synth java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__AUTO_SYNTH_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_AutoSynth_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Context java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__CONTEXT_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getAppBuilder_core_Context_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Outdir java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__OUTDIR_JAVA_LANG_STRING_ = eINSTANCE.getAppBuilder_core_Outdir_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Runtime Info java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__RUNTIME_INFO_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_RuntimeInfo_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Stack Traces java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__STACK_TRACES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_StackTraces_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Tree Metadata java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__TREE_METADATA_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getAppBuilder_core_TreeMetadata_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE.getAppBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__VAR_NAME = eINSTANCE.getAppBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__IDENTIFIER = eINSTANCE.getAppBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getAppBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.TagManagerBuilder_coreImpl <em>Tag Manager Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.TagManagerBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getTagManagerBuilder_core()
		 * @generated
		 */
		EClass TAG_MANAGER_BUILDER_CORE = eINSTANCE.getTagManagerBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Tag Property Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_BUILDER_CORE__TAG_PROPERTY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getTagManagerBuilder_core_TagPropertyName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getTagManagerBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_BUILDER_CORE__VAR_NAME = eINSTANCE.getTagManagerBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_BUILDER_CORE__IDENTIFIER = eINSTANCE.getTagManagerBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG_MANAGER_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getTagManagerBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.LazyAnyValueOptionsBuilder_coreImpl <em>Lazy Any Value Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.LazyAnyValueOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getLazyAnyValueOptionsBuilder_core()
		 * @generated
		 */
		EClass LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE = eINSTANCE.getLazyAnyValueOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Display Hint java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__DISPLAY_HINT_JAVA_LANG_STRING_ = eINSTANCE
				.getLazyAnyValueOptionsBuilder_core_DisplayHint_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Omit Empty Array java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__OMIT_EMPTY_ARRAY_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getLazyAnyValueOptionsBuilder_core_OmitEmptyArray_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getLazyAnyValueOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getLazyAnyValueOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getLazyAnyValueOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAZY_ANY_VALUE_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getLazyAnyValueOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.DockerImageAssetSourceBuilder_coreImpl <em>Docker Image Asset Source Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DockerImageAssetSourceBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getDockerImageAssetSourceBuilder_core()
		 * @generated
		 */
		EClass DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE = eINSTANCE.getDockerImageAssetSourceBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Directory Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_DirectoryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Source Hash java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_ = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_SourceHash_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Docker Build Args java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_DockerBuildArgs_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Docker Build Target java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_ = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_DockerBuildTarget_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Docker File java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_ = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_DockerFile_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Repository Name java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_ = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_RepositoryName_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getDockerImageAssetSourceBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.NestedStackPropsBuilder_coreImpl <em>Nested Stack Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.NestedStackPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getNestedStackPropsBuilder_core()
		 * @generated
		 */
		EClass NESTED_STACK_PROPS_BUILDER_CORE = eINSTANCE.getNestedStackPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Notification Arns java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_PROPS_BUILDER_CORE__NOTIFICATION_ARNS_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getNestedStackPropsBuilder_core_NotificationArns_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Parameters java lang String java lang String As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_PROPS_BUILDER_CORE__PARAMETERS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP = eINSTANCE
				.getNestedStackPropsBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap();

		/**
		 * The meta object literal for the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_PROPS_BUILDER_CORE__TIMEOUT_WITH_DURATION_SOFTWARE_AMAZON_AWSCDK_CORE_DURATION_AS_REFERENCE = eINSTANCE
				.getNestedStackPropsBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getNestedStackPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE.getNestedStackPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getNestedStackPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NESTED_STACK_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getNestedStackPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.GetContextKeyResultBuilder_coreImpl <em>Get Context Key Result Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.GetContextKeyResultBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getGetContextKeyResultBuilder_core()
		 * @generated
		 */
		EClass GET_CONTEXT_KEY_RESULT_BUILDER_CORE = eINSTANCE.getGetContextKeyResultBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Key java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_RESULT_BUILDER_CORE__KEY_JAVA_LANG_STRING_ = eINSTANCE
				.getGetContextKeyResultBuilder_core_Key_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Props java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_RESULT_BUILDER_CORE__PROPS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getGetContextKeyResultBuilder_core_Props_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_RESULT_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getGetContextKeyResultBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_RESULT_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getGetContextKeyResultBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_RESULT_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getGetContextKeyResultBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CONTEXT_KEY_RESULT_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getGetContextKeyResultBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.AssetStagingPropsBuilder_coreImpl <em>Asset Staging Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.AssetStagingPropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getAssetStagingPropsBuilder_core()
		 * @generated
		 */
		EClass ASSET_STAGING_PROPS_BUILDER_CORE = eINSTANCE.getAssetStagingPropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Source Path java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_ = eINSTANCE
				.getAssetStagingPropsBuilder_core_SourcePath_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Extra Hash java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_ = eINSTANCE
				.getAssetStagingPropsBuilder_core_ExtraHash_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Exclude java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getAssetStagingPropsBuilder_core_Exclude_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = eINSTANCE
				.getAssetStagingPropsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getAssetStagingPropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE.getAssetStagingPropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getAssetStagingPropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_STAGING_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getAssetStagingPropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.DependencyBuilder_coreImpl <em>Dependency Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.DependencyBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getDependencyBuilder_core()
		 * @generated
		 */
		EClass DEPENDENCY_BUILDER_CORE = eINSTANCE.getDependencyBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Source With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_BUILDER_CORE__SOURCE_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = eINSTANCE
				.getDependencyBuilder_core_SourceWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

		/**
		 * The meta object literal for the '<em><b>Target With IConstruct software amazon awscdk core IConstruct As Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_BUILDER_CORE__TARGET_WITH_ICONSTRUCT_SOFTWARE_AMAZON_AWSCDK_CORE_ICONSTRUCT_AS_REFERENCE = eINSTANCE
				.getDependencyBuilder_core_TargetWithIConstruct_software_amazon_awscdk_core_IConstruct_AsReference();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getDependencyBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_BUILDER_CORE__VAR_NAME = eINSTANCE.getDependencyBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_BUILDER_CORE__IDENTIFIER = eINSTANCE.getDependencyBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENCY_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getDependencyBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.CopyOptionsBuilder_coreImpl <em>Copy Options Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CopyOptionsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getCopyOptionsBuilder_core()
		 * @generated
		 */
		EClass COPY_OPTIONS_BUILDER_CORE = eINSTANCE.getCopyOptionsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Exclude java lang String As List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OPTIONS_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST = eINSTANCE
				.getCopyOptionsBuilder_core_Exclude_java_lang_String_AsList();

		/**
		 * The meta object literal for the '<em><b>Follow software amazon awscdk core Symlink Follow Mode </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OPTIONS_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_ = eINSTANCE
				.getCopyOptionsBuilder_core_Follow_software_amazon_awscdk_core_SymlinkFollowMode_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OPTIONS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getCopyOptionsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OPTIONS_BUILDER_CORE__VAR_NAME = eINSTANCE.getCopyOptionsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OPTIONS_BUILDER_CORE__IDENTIFIER = eINSTANCE.getCopyOptionsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_OPTIONS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE.getCopyOptionsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.impl.CustomResourcePropsBuilder_coreImpl <em>Custom Resource Props Builder core</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.impl.CustomResourcePropsBuilder_coreImpl
		 * @see core.impl.CorePackageImpl#getCustomResourcePropsBuilder_core()
		 * @generated
		 */
		EClass CUSTOM_RESOURCE_PROPS_BUILDER_CORE = eINSTANCE.getCustomResourcePropsBuilder_core();

		/**
		 * The meta object literal for the '<em><b>Service Token java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__SERVICE_TOKEN_JAVA_LANG_STRING_ = eINSTANCE
				.getCustomResourcePropsBuilder_core_ServiceToken_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Pascal Case Properties java lang Boolean </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__PASCAL_CASE_PROPERTIES_JAVA_LANG_BOOLEAN_ = eINSTANCE
				.getCustomResourcePropsBuilder_core_PascalCaseProperties_java_lang_Boolean_();

		/**
		 * The meta object literal for the '<em><b>Properties java lang String java lang Object As Map</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__PROPERTIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP = eINSTANCE
				.getCustomResourcePropsBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap();

		/**
		 * The meta object literal for the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__REMOVAL_POLICY_SOFTWARE_AMAZON_AWSCDK_CORE_REMOVAL_POLICY_ = eINSTANCE
				.getCustomResourcePropsBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

		/**
		 * The meta object literal for the '<em><b>Resource Type java lang String </b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__RESOURCE_TYPE_JAVA_LANG_STRING_ = eINSTANCE
				.getCustomResourcePropsBuilder_core_ResourceType_java_lang_String_();

		/**
		 * The meta object literal for the '<em><b>Generated Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__GENERATED_CLASS_NAME = eINSTANCE
				.getCustomResourcePropsBuilder_core_GeneratedClassName();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__VAR_NAME = eINSTANCE
				.getCustomResourcePropsBuilder_core_VarName();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__IDENTIFIER = eINSTANCE
				.getCustomResourcePropsBuilder_core_Identifier();

		/**
		 * The meta object literal for the '<em><b>Additional Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_RESOURCE_PROPS_BUILDER_CORE__ADDITIONAL_CODE = eINSTANCE
				.getCustomResourcePropsBuilder_core_AdditionalCode();

		/**
		 * The meta object literal for the '{@link core.FileAssetPackaging <em>File Asset Packaging</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.FileAssetPackaging
		 * @see core.impl.CorePackageImpl#getFileAssetPackaging()
		 * @generated
		 */
		EEnum FILE_ASSET_PACKAGING = eINSTANCE.getFileAssetPackaging();

		/**
		 * The meta object literal for the '{@link core.CfnDynamicReferenceService <em>Cfn Dynamic Reference Service</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.CfnDynamicReferenceService
		 * @see core.impl.CorePackageImpl#getCfnDynamicReferenceService()
		 * @generated
		 */
		EEnum CFN_DYNAMIC_REFERENCE_SERVICE = eINSTANCE.getCfnDynamicReferenceService();

		/**
		 * The meta object literal for the '{@link core.TagType <em>Tag Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.TagType
		 * @see core.impl.CorePackageImpl#getTagType()
		 * @generated
		 */
		EEnum TAG_TYPE = eINSTANCE.getTagType();

		/**
		 * The meta object literal for the '{@link core.RemovalPolicy <em>Removal Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.RemovalPolicy
		 * @see core.impl.CorePackageImpl#getRemovalPolicy()
		 * @generated
		 */
		EEnum REMOVAL_POLICY = eINSTANCE.getRemovalPolicy();

		/**
		 * The meta object literal for the '{@link core.SizeRoundingBehavior <em>Size Rounding Behavior</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.SizeRoundingBehavior
		 * @see core.impl.CorePackageImpl#getSizeRoundingBehavior()
		 * @generated
		 */
		EEnum SIZE_ROUNDING_BEHAVIOR = eINSTANCE.getSizeRoundingBehavior();

		/**
		 * The meta object literal for the '{@link core.CfnCapabilities <em>Cfn Capabilities</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.CfnCapabilities
		 * @see core.impl.CorePackageImpl#getCfnCapabilities()
		 * @generated
		 */
		EEnum CFN_CAPABILITIES = eINSTANCE.getCfnCapabilities();

		/**
		 * The meta object literal for the '{@link core.ConstructOrder <em>Construct Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.ConstructOrder
		 * @see core.impl.CorePackageImpl#getConstructOrder()
		 * @generated
		 */
		EEnum CONSTRUCT_ORDER = eINSTANCE.getConstructOrder();

		/**
		 * The meta object literal for the '{@link core.CustomResourceProviderRuntime <em>Custom Resource Provider Runtime</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.CustomResourceProviderRuntime
		 * @see core.impl.CorePackageImpl#getCustomResourceProviderRuntime()
		 * @generated
		 */
		EEnum CUSTOM_RESOURCE_PROVIDER_RUNTIME = eINSTANCE.getCustomResourceProviderRuntime();

		/**
		 * The meta object literal for the '{@link core.CfnDeletionPolicy <em>Cfn Deletion Policy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.CfnDeletionPolicy
		 * @see core.impl.CorePackageImpl#getCfnDeletionPolicy()
		 * @generated
		 */
		EEnum CFN_DELETION_POLICY = eINSTANCE.getCfnDeletionPolicy();

		/**
		 * The meta object literal for the '{@link core.SymlinkFollowMode <em>Symlink Follow Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see core.SymlinkFollowMode
		 * @see core.impl.CorePackageImpl#getSymlinkFollowMode()
		 * @generated
		 */
		EEnum SYMLINK_FOLLOW_MODE = eINSTANCE.getSymlinkFollowMode();

	}

} //CorePackage
