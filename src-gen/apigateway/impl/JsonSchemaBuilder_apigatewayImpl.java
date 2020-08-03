/**
 */
package apigateway.impl;

import apigateway.ApigatewayPackage;
import apigateway.JsonSchemaBuilder_apigateway;
import apigateway.JsonSchemaType;
import apigateway.JsonSchemaVersion;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Json Schema Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList <em>Additional Items software amazon awscdk services apigateway Json Schema As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getAdditionalProperties_java_lang_Boolean_ <em>Additional Properties java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList <em>All Of software amazon awscdk services apigateway Json Schema As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList <em>Any Of software amazon awscdk services apigateway Json Schema As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference <em>Contains With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList <em>Contains software amazon awscdk services apigateway Json Schema As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap <em>Definitions java lang String software amazon awscdk services apigateway Json Schema As Map</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getDependencies_java_lang_String__java_lang_Object_AsMap <em>Dependencies java lang String java lang Object As Map</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getDescription_java_lang_String_ <em>Description java lang String </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getEnumValue_java_lang_Object_AsList <em>Enum Value java lang Object As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getExclusiveMaximum_java_lang_Boolean_ <em>Exclusive Maximum java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getExclusiveMinimum_java_lang_Boolean_ <em>Exclusive Minimum java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getFormat_java_lang_String_ <em>Format java lang String </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getId_java_lang_String_ <em>Id java lang String </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference <em>Items With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList <em>Items software amazon awscdk services apigateway Json Schema As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMaximum_java_lang_Number_ <em>Maximum java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMaxItems_java_lang_Number_ <em>Max Items java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMaxLength_java_lang_Number_ <em>Max Length java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMaxProperties_java_lang_Number_ <em>Max Properties java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMinimum_java_lang_Number_ <em>Minimum java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMinItems_java_lang_Number_ <em>Min Items java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMinLength_java_lang_Number_ <em>Min Length java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMinProperties_java_lang_Number_ <em>Min Properties java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getMultipleOf_java_lang_Number_ <em>Multiple Of java lang Number </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference <em>Not With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList <em>One Of software amazon awscdk services apigateway Json Schema As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getPattern_java_lang_String_ <em>Pattern java lang String </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap <em>Pattern Properties java lang String software amazon awscdk services apigateway Json Schema As Map</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap <em>Properties java lang String software amazon awscdk services apigateway Json Schema As Map</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference <em>Property Names With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getRef_java_lang_String_ <em>Ref java lang String </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getRequired_java_lang_String_AsList <em>Required java lang String As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_ <em>Schema software amazon awscdk services apigateway Json Schema Version </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getTitle_java_lang_String_ <em>Title java lang String </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_ <em>Type software amazon awscdk services apigateway Json Schema Type </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList <em>Type software amazon awscdk services apigateway Json Schema Type As List</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getUniqueItems_java_lang_Boolean_ <em>Unique Items java lang Boolean </em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.impl.JsonSchemaBuilder_apigatewayImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JsonSchemaBuilder_apigatewayImpl extends MinimalEObjectImpl.Container
		implements JsonSchemaBuilder_apigateway {
	/**
	 * The default value of the '{@link #getAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Additional Items software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Additional Items software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected String additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalProperties_java_lang_Boolean_() <em>Additional Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalProperties_java_lang_Boolean_() <em>Additional Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean additionalProperties_java_lang_Boolean_ = ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>All Of software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>All Of software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected String allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Any Of software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Any Of software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected String anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Contains With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Contains With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Contains software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Contains software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected String contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() <em>Definitions java lang String software amazon awscdk services apigateway Json Schema As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() <em>Definitions java lang String software amazon awscdk services apigateway Json Schema As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDependencies_java_lang_String__java_lang_Object_AsMap() <em>Dependencies java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDependencies_java_lang_String__java_lang_Object_AsMap() <em>Dependencies java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String dependencies_java_lang_String__java_lang_Object_AsMap = DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription_java_lang_String_() <em>Description java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String description_java_lang_String_ = DESCRIPTION_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getEnumValue_java_lang_Object_AsList() <em>Enum Value java lang Object As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValue_java_lang_Object_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumValue_java_lang_Object_AsList() <em>Enum Value java lang Object As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValue_java_lang_Object_AsList()
	 * @generated
	 * @ordered
	 */
	protected String enumValue_java_lang_Object_AsList = ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveMaximum_java_lang_Boolean_() <em>Exclusive Maximum java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMaximum_java_lang_Boolean_() <em>Exclusive Maximum java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMaximum_java_lang_Boolean_ = EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveMinimum_java_lang_Boolean_() <em>Exclusive Minimum java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMinimum_java_lang_Boolean_() <em>Exclusive Minimum java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMinimum_java_lang_Boolean_ = EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat_java_lang_String_() <em>Format java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat_java_lang_String_() <em>Format java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String format_java_lang_String_ = FORMAT_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String id_java_lang_String_ = ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Items With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Items With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Items software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>Items software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected String items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum_java_lang_Number_() <em>Maximum java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximum_java_lang_Number_() <em>Maximum java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maximum_java_lang_Number_ = MAXIMUM_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems_java_lang_Number_() <em>Max Items java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITEMS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxItems_java_lang_Number_() <em>Max Items java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxItems_java_lang_Number_ = MAX_ITEMS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength_java_lang_Number_() <em>Max Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLength_java_lang_Number_() <em>Max Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxLength_java_lang_Number_ = MAX_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxProperties_java_lang_Number_() <em>Max Properties java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxProperties_java_lang_Number_() <em>Max Properties java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int maxProperties_java_lang_Number_ = MAX_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum_java_lang_Number_() <em>Minimum java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimum_java_lang_Number_() <em>Minimum java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minimum_java_lang_Number_ = MINIMUM_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinItems_java_lang_Number_() <em>Min Items java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ITEMS_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinItems_java_lang_Number_() <em>Min Items java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minItems_java_lang_Number_ = MIN_ITEMS_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLength_java_lang_Number_() <em>Min Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength_java_lang_Number_() <em>Min Length java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minLength_java_lang_Number_ = MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMinProperties_java_lang_Number_() <em>Min Properties java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinProperties_java_lang_Number_() <em>Min Properties java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int minProperties_java_lang_Number_ = MIN_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleOf_java_lang_Number_() <em>Multiple Of java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLE_OF_JAVA_LANG_NUMBER__EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultipleOf_java_lang_Number_() <em>Multiple Of java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf_java_lang_Number_()
	 * @generated
	 * @ordered
	 */
	protected int multipleOf_java_lang_Number_ = MULTIPLE_OF_JAVA_LANG_NUMBER__EDEFAULT;

	/**
	 * The default value of the '{@link #getNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Not With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Not With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>One Of software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() <em>One Of software amazon awscdk services apigateway Json Schema As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList()
	 * @generated
	 * @ordered
	 */
	protected String oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern_java_lang_String_() <em>Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern_java_lang_String_() <em>Pattern java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String pattern_java_lang_String_ = PATTERN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() <em>Pattern Properties java lang String software amazon awscdk services apigateway Json Schema As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() <em>Pattern Properties java lang String software amazon awscdk services apigateway Json Schema As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() <em>Properties java lang String software amazon awscdk services apigateway Json Schema As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() <em>Properties java lang String software amazon awscdk services apigateway Json Schema As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Property Names With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() <em>Property Names With Json Schema software amazon awscdk services apigateway Json Schema As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef_java_lang_String_() <em>Ref java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef_java_lang_String_() <em>Ref java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String ref_java_lang_String_ = REF_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired_java_lang_String_AsList() <em>Required java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired_java_lang_String_AsList() <em>Required java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String required_java_lang_String_AsList = REQUIRED_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_() <em>Schema software amazon awscdk services apigateway Json Schema Version </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_()
	 * @generated
	 * @ordered
	 */
	protected static final JsonSchemaVersion SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION__EDEFAULT = JsonSchemaVersion.DRAFT4;

	/**
	 * The cached value of the '{@link #getSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_() <em>Schema software amazon awscdk services apigateway Json Schema Version </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_()
	 * @generated
	 * @ordered
	 */
	protected JsonSchemaVersion schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_ = SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION__EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle_java_lang_String_() <em>Title java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle_java_lang_String_() <em>Title java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String title_java_lang_String_ = TITLE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_() <em>Type software amazon awscdk services apigateway Json Schema Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_()
	 * @generated
	 * @ordered
	 */
	protected static final JsonSchemaType TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE__EDEFAULT = JsonSchemaType.NULL;

	/**
	 * The cached value of the '{@link #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_() <em>Type software amazon awscdk services apigateway Json Schema Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_()
	 * @generated
	 * @ordered
	 */
	protected JsonSchemaType type_software_amazon_awscdk_services_apigateway_JsonSchemaType_ = TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE__EDEFAULT;

	/**
	 * The default value of the '{@link #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList() <em>Type software amazon awscdk services apigateway Json Schema Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList() <em>Type software amazon awscdk services apigateway Json Schema Type As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList()
	 * @generated
	 * @ordered
	 */
	protected String type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList = TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getUniqueItems_java_lang_Boolean_() <em>Unique Items java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNIQUE_ITEMS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueItems_java_lang_Boolean_() <em>Unique Items java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean uniqueItems_java_lang_Boolean_ = UNIQUE_ITEMS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.apigateway.JsonSchema";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JsonSchemaBuilder_apigatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApigatewayPackage.Literals.JSON_SCHEMA_BUILDER_APIGATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
			String newAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList) {
		String oldAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = newAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
					oldAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList,
					additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAdditionalProperties_java_lang_Boolean_() {
		return additionalProperties_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalProperties_java_lang_Boolean_(Boolean newAdditionalProperties_java_lang_Boolean_) {
		Boolean oldAdditionalProperties_java_lang_Boolean_ = additionalProperties_java_lang_Boolean_;
		additionalProperties_java_lang_Boolean_ = newAdditionalProperties_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_,
					oldAdditionalProperties_java_lang_Boolean_, additionalProperties_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
			String newAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList) {
		String oldAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = newAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
					oldAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList,
					allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
			String newAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList) {
		String oldAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = newAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
					oldAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList,
					anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
			String newContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference) {
		String oldContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = newContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
					oldContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference,
					containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
			String newContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList) {
		String oldContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = newContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
					oldContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList,
					contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() {
		return definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
			String newDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap) {
		String oldDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
		definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = newDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP,
					oldDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap,
					definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDependencies_java_lang_String__java_lang_Object_AsMap() {
		return dependencies_java_lang_String__java_lang_Object_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDependencies_java_lang_String__java_lang_Object_AsMap(
			String newDependencies_java_lang_String__java_lang_Object_AsMap) {
		String oldDependencies_java_lang_String__java_lang_Object_AsMap = dependencies_java_lang_String__java_lang_Object_AsMap;
		dependencies_java_lang_String__java_lang_Object_AsMap = newDependencies_java_lang_String__java_lang_Object_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
					oldDependencies_java_lang_String__java_lang_Object_AsMap,
					dependencies_java_lang_String__java_lang_Object_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription_java_lang_String_() {
		return description_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription_java_lang_String_(String newDescription_java_lang_String_) {
		String oldDescription_java_lang_String_ = description_java_lang_String_;
		description_java_lang_String_ = newDescription_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_,
					oldDescription_java_lang_String_, description_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnumValue_java_lang_Object_AsList() {
		return enumValue_java_lang_Object_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnumValue_java_lang_Object_AsList(String newEnumValue_java_lang_Object_AsList) {
		String oldEnumValue_java_lang_Object_AsList = enumValue_java_lang_Object_AsList;
		enumValue_java_lang_Object_AsList = newEnumValue_java_lang_Object_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST,
					oldEnumValue_java_lang_Object_AsList, enumValue_java_lang_Object_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExclusiveMaximum_java_lang_Boolean_() {
		return exclusiveMaximum_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMaximum_java_lang_Boolean_(Boolean newExclusiveMaximum_java_lang_Boolean_) {
		Boolean oldExclusiveMaximum_java_lang_Boolean_ = exclusiveMaximum_java_lang_Boolean_;
		exclusiveMaximum_java_lang_Boolean_ = newExclusiveMaximum_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_,
					oldExclusiveMaximum_java_lang_Boolean_, exclusiveMaximum_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExclusiveMinimum_java_lang_Boolean_() {
		return exclusiveMinimum_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMinimum_java_lang_Boolean_(Boolean newExclusiveMinimum_java_lang_Boolean_) {
		Boolean oldExclusiveMinimum_java_lang_Boolean_ = exclusiveMinimum_java_lang_Boolean_;
		exclusiveMinimum_java_lang_Boolean_ = newExclusiveMinimum_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_,
					oldExclusiveMinimum_java_lang_Boolean_, exclusiveMinimum_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat_java_lang_String_() {
		return format_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat_java_lang_String_(String newFormat_java_lang_String_) {
		String oldFormat_java_lang_String_ = format_java_lang_String_;
		format_java_lang_String_ = newFormat_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_,
					oldFormat_java_lang_String_, format_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_java_lang_String_() {
		return id_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_java_lang_String_(String newId_java_lang_String_) {
		String oldId_java_lang_String_ = id_java_lang_String_;
		id_java_lang_String_ = newId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_, oldId_java_lang_String_,
					id_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
			String newItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference) {
		String oldItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = newItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
					oldItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference,
					itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
			String newItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList) {
		String oldItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = newItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
					oldItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList,
					items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximum_java_lang_Number_() {
		return maximum_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum_java_lang_Number_(int newMaximum_java_lang_Number_) {
		int oldMaximum_java_lang_Number_ = maximum_java_lang_Number_;
		maximum_java_lang_Number_ = newMaximum_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_,
					oldMaximum_java_lang_Number_, maximum_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxItems_java_lang_Number_() {
		return maxItems_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxItems_java_lang_Number_(int newMaxItems_java_lang_Number_) {
		int oldMaxItems_java_lang_Number_ = maxItems_java_lang_Number_;
		maxItems_java_lang_Number_ = newMaxItems_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_,
					oldMaxItems_java_lang_Number_, maxItems_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxLength_java_lang_Number_() {
		return maxLength_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength_java_lang_Number_(int newMaxLength_java_lang_Number_) {
		int oldMaxLength_java_lang_Number_ = maxLength_java_lang_Number_;
		maxLength_java_lang_Number_ = newMaxLength_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_,
					oldMaxLength_java_lang_Number_, maxLength_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaxProperties_java_lang_Number_() {
		return maxProperties_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxProperties_java_lang_Number_(int newMaxProperties_java_lang_Number_) {
		int oldMaxProperties_java_lang_Number_ = maxProperties_java_lang_Number_;
		maxProperties_java_lang_Number_ = newMaxProperties_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_,
					oldMaxProperties_java_lang_Number_, maxProperties_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinimum_java_lang_Number_() {
		return minimum_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum_java_lang_Number_(int newMinimum_java_lang_Number_) {
		int oldMinimum_java_lang_Number_ = minimum_java_lang_Number_;
		minimum_java_lang_Number_ = newMinimum_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_,
					oldMinimum_java_lang_Number_, minimum_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinItems_java_lang_Number_() {
		return minItems_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinItems_java_lang_Number_(int newMinItems_java_lang_Number_) {
		int oldMinItems_java_lang_Number_ = minItems_java_lang_Number_;
		minItems_java_lang_Number_ = newMinItems_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_,
					oldMinItems_java_lang_Number_, minItems_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinLength_java_lang_Number_() {
		return minLength_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength_java_lang_Number_(int newMinLength_java_lang_Number_) {
		int oldMinLength_java_lang_Number_ = minLength_java_lang_Number_;
		minLength_java_lang_Number_ = newMinLength_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_,
					oldMinLength_java_lang_Number_, minLength_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMinProperties_java_lang_Number_() {
		return minProperties_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinProperties_java_lang_Number_(int newMinProperties_java_lang_Number_) {
		int oldMinProperties_java_lang_Number_ = minProperties_java_lang_Number_;
		minProperties_java_lang_Number_ = newMinProperties_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_,
					oldMinProperties_java_lang_Number_, minProperties_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMultipleOf_java_lang_Number_() {
		return multipleOf_java_lang_Number_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleOf_java_lang_Number_(int newMultipleOf_java_lang_Number_) {
		int oldMultipleOf_java_lang_Number_ = multipleOf_java_lang_Number_;
		multipleOf_java_lang_Number_ = newMultipleOf_java_lang_Number_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_,
					oldMultipleOf_java_lang_Number_, multipleOf_java_lang_Number_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
			String newNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference) {
		String oldNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = newNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
					oldNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference,
					notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList() {
		return oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
			String newOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList) {
		String oldOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList = newOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST,
					oldOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList,
					oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern_java_lang_String_() {
		return pattern_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern_java_lang_String_(String newPattern_java_lang_String_) {
		String oldPattern_java_lang_String_ = pattern_java_lang_String_;
		pattern_java_lang_String_ = newPattern_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_,
					oldPattern_java_lang_String_, pattern_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() {
		return patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
			String newPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap) {
		String oldPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
		patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = newPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP,
					oldPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap,
					patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap() {
		return properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
			String newProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap) {
		String oldProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
		properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap = newProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP,
					oldProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap,
					properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference() {
		return propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
			String newPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference) {
		String oldPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference = newPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE,
					oldPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference,
					propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRef_java_lang_String_() {
		return ref_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRef_java_lang_String_(String newRef_java_lang_String_) {
		String oldRef_java_lang_String_ = ref_java_lang_String_;
		ref_java_lang_String_ = newRef_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_, oldRef_java_lang_String_,
					ref_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRequired_java_lang_String_AsList() {
		return required_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired_java_lang_String_AsList(String newRequired_java_lang_String_AsList) {
		String oldRequired_java_lang_String_AsList = required_java_lang_String_AsList;
		required_java_lang_String_AsList = newRequired_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST,
					oldRequired_java_lang_String_AsList, required_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonSchemaVersion getSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_() {
		return schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_(
			JsonSchemaVersion newSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_) {
		JsonSchemaVersion oldSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_ = schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_;
		schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_ = newSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_ == null
				? SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION__EDEFAULT
				: newSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_,
					oldSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_,
					schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle_java_lang_String_() {
		return title_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle_java_lang_String_(String newTitle_java_lang_String_) {
		String oldTitle_java_lang_String_ = title_java_lang_String_;
		title_java_lang_String_ = newTitle_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_,
					oldTitle_java_lang_String_, title_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonSchemaType getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_() {
		return type_software_amazon_awscdk_services_apigateway_JsonSchemaType_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_software_amazon_awscdk_services_apigateway_JsonSchemaType_(
			JsonSchemaType newType_software_amazon_awscdk_services_apigateway_JsonSchemaType_) {
		JsonSchemaType oldType_software_amazon_awscdk_services_apigateway_JsonSchemaType_ = type_software_amazon_awscdk_services_apigateway_JsonSchemaType_;
		type_software_amazon_awscdk_services_apigateway_JsonSchemaType_ = newType_software_amazon_awscdk_services_apigateway_JsonSchemaType_ == null
				? TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE__EDEFAULT
				: newType_software_amazon_awscdk_services_apigateway_JsonSchemaType_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_,
					oldType_software_amazon_awscdk_services_apigateway_JsonSchemaType_,
					type_software_amazon_awscdk_services_apigateway_JsonSchemaType_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList() {
		return type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList(
			String newType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList) {
		String oldType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList = type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList;
		type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList = newType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST,
					oldType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList,
					type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUniqueItems_java_lang_Boolean_() {
		return uniqueItems_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueItems_java_lang_Boolean_(Boolean newUniqueItems_java_lang_Boolean_) {
		Boolean oldUniqueItems_java_lang_Boolean_ = uniqueItems_java_lang_Boolean_;
		uniqueItems_java_lang_Boolean_ = newUniqueItems_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_,
					oldUniqueItems_java_lang_Boolean_, uniqueItems_java_lang_Boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return getAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_:
			return getAdditionalProperties_java_lang_Boolean_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return getAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return getAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return getContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return getContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			return getDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return getDependencies_java_lang_String__java_lang_Object_AsMap();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return getDescription_java_lang_String_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST:
			return getEnumValue_java_lang_Object_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_:
			return getExclusiveMaximum_java_lang_Boolean_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_:
			return getExclusiveMinimum_java_lang_Boolean_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_:
			return getFormat_java_lang_String_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_:
			return getId_java_lang_String_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return getItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return getItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_:
			return getMaximum_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_:
			return getMaxItems_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_:
			return getMaxLength_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_:
			return getMaxProperties_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_:
			return getMinimum_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_:
			return getMinItems_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_:
			return getMinLength_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_:
			return getMinProperties_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_:
			return getMultipleOf_java_lang_Number_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return getNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return getOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_:
			return getPattern_java_lang_String_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			return getPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			return getProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return getPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_:
			return getRef_java_lang_String_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST:
			return getRequired_java_lang_String_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_:
			return getSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_:
			return getTitle_java_lang_String_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_:
			return getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST:
			return getType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_:
			return getUniqueItems_java_lang_Boolean_();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME:
			return getVarName();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER:
			return getIdentifier();
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_:
			setAdditionalProperties_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			setDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
					(String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setDependencies_java_lang_String__java_lang_Object_AsMap((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST:
			setEnumValue_java_lang_Object_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_:
			setExclusiveMaximum_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_:
			setExclusiveMinimum_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_:
			setFormat_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_:
			setMaximum_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_:
			setMaxItems_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_:
			setMaxLength_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_:
			setMaxProperties_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_:
			setMinimum_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_:
			setMinItems_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_:
			setMinLength_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_:
			setMinProperties_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_:
			setMultipleOf_java_lang_Number_((Integer) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_:
			setPattern_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			setPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
					(String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			setProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
					(String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
					(String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_:
			setRef_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST:
			setRequired_java_lang_String_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_:
			setSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_((JsonSchemaVersion) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_:
			setTitle_java_lang_String_((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_:
			setType_software_amazon_awscdk_services_apigateway_JsonSchemaType_((JsonSchemaType) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST:
			setType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_:
			setUniqueItems_java_lang_Boolean_((Boolean) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setAdditionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
					ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_:
			setAdditionalProperties_java_lang_Boolean_(ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setAllOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
					ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setAnyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
					ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setContainsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
					CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setContains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
					CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			setDefinitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
					DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setDependencies_java_lang_String__java_lang_Object_AsMap(
					DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			setDescription_java_lang_String_(DESCRIPTION_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST:
			setEnumValue_java_lang_Object_AsList(ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_:
			setExclusiveMaximum_java_lang_Boolean_(EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_:
			setExclusiveMinimum_java_lang_Boolean_(EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_:
			setFormat_java_lang_String_(FORMAT_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_(ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setItemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
					ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
					ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_:
			setMaximum_java_lang_Number_(MAXIMUM_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_:
			setMaxItems_java_lang_Number_(MAX_ITEMS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_:
			setMaxLength_java_lang_Number_(MAX_LENGTH_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_:
			setMaxProperties_java_lang_Number_(MAX_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_:
			setMinimum_java_lang_Number_(MINIMUM_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_:
			setMinItems_java_lang_Number_(MIN_ITEMS_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_:
			setMinLength_java_lang_Number_(MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_:
			setMinProperties_java_lang_Number_(MIN_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_:
			setMultipleOf_java_lang_Number_(MULTIPLE_OF_JAVA_LANG_NUMBER__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setNotWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
					NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			setOneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList(
					ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_:
			setPattern_java_lang_String_(PATTERN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			setPatternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
					PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			setProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap(
					PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			setPropertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference(
					PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_:
			setRef_java_lang_String_(REF_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST:
			setRequired_java_lang_String_AsList(REQUIRED_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_:
			setSchema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_(
					SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_:
			setTitle_java_lang_String_(TITLE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_:
			setType_software_amazon_awscdk_services_apigateway_JsonSchemaType_(
					TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST:
			setType_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList(
					TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_:
			setUniqueItems_java_lang_Boolean_(UNIQUE_ITEMS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT == null
					? additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList != null
					: !ADDITIONAL_ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT
							.equals(additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN_:
			return ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? additionalProperties_java_lang_Boolean_ != null
					: !ADDITIONAL_PROPERTIES_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(additionalProperties_java_lang_Boolean_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT == null
					? allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList != null
					: !ALL_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT
							.equals(allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT == null
					? anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList != null
					: !ANY_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT
							.equals(anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT == null
					? containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference != null
					: !CONTAINS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT
							.equals(containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT == null
					? contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList != null
					: !CONTAINS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT
							.equals(contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			return DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT == null
					? definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap != null
					: !DEFINITIONS_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT
							.equals(definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT == null
					? dependencies_java_lang_String__java_lang_Object_AsMap != null
					: !DEPENDENCIES_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT
							.equals(dependencies_java_lang_String__java_lang_Object_AsMap);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__DESCRIPTION_JAVA_LANG_STRING_:
			return DESCRIPTION_JAVA_LANG_STRING__EDEFAULT == null ? description_java_lang_String_ != null
					: !DESCRIPTION_JAVA_LANG_STRING__EDEFAULT.equals(description_java_lang_String_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST:
			return ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT == null ? enumValue_java_lang_Object_AsList != null
					: !ENUM_VALUE_JAVA_LANG_OBJECT_AS_LIST_EDEFAULT.equals(enumValue_java_lang_Object_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN_:
			return EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN__EDEFAULT == null ? exclusiveMaximum_java_lang_Boolean_ != null
					: !EXCLUSIVE_MAXIMUM_JAVA_LANG_BOOLEAN__EDEFAULT.equals(exclusiveMaximum_java_lang_Boolean_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN_:
			return EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN__EDEFAULT == null ? exclusiveMinimum_java_lang_Boolean_ != null
					: !EXCLUSIVE_MINIMUM_JAVA_LANG_BOOLEAN__EDEFAULT.equals(exclusiveMinimum_java_lang_Boolean_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__FORMAT_JAVA_LANG_STRING_:
			return FORMAT_JAVA_LANG_STRING__EDEFAULT == null ? format_java_lang_String_ != null
					: !FORMAT_JAVA_LANG_STRING__EDEFAULT.equals(format_java_lang_String_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ID_JAVA_LANG_STRING_:
			return ID_JAVA_LANG_STRING__EDEFAULT == null ? id_java_lang_String_ != null
					: !ID_JAVA_LANG_STRING__EDEFAULT.equals(id_java_lang_String_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT == null
					? itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference != null
					: !ITEMS_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT
							.equals(itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT == null
					? items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList != null
					: !ITEMS_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT
							.equals(items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAXIMUM_JAVA_LANG_NUMBER_:
			return maximum_java_lang_Number_ != MAXIMUM_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_ITEMS_JAVA_LANG_NUMBER_:
			return maxItems_java_lang_Number_ != MAX_ITEMS_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_LENGTH_JAVA_LANG_NUMBER_:
			return maxLength_java_lang_Number_ != MAX_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MAX_PROPERTIES_JAVA_LANG_NUMBER_:
			return maxProperties_java_lang_Number_ != MAX_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MINIMUM_JAVA_LANG_NUMBER_:
			return minimum_java_lang_Number_ != MINIMUM_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_ITEMS_JAVA_LANG_NUMBER_:
			return minItems_java_lang_Number_ != MIN_ITEMS_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_LENGTH_JAVA_LANG_NUMBER_:
			return minLength_java_lang_Number_ != MIN_LENGTH_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MIN_PROPERTIES_JAVA_LANG_NUMBER_:
			return minProperties_java_lang_Number_ != MIN_PROPERTIES_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__MULTIPLE_OF_JAVA_LANG_NUMBER_:
			return multipleOf_java_lang_Number_ != MULTIPLE_OF_JAVA_LANG_NUMBER__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT == null
					? notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference != null
					: !NOT_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT
							.equals(notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST:
			return ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT == null
					? oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList != null
					: !ONE_OF_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_LIST_EDEFAULT
							.equals(oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_JAVA_LANG_STRING_:
			return PATTERN_JAVA_LANG_STRING__EDEFAULT == null ? pattern_java_lang_String_ != null
					: !PATTERN_JAVA_LANG_STRING__EDEFAULT.equals(pattern_java_lang_String_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			return PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT == null
					? patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap != null
					: !PATTERN_PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT
							.equals(patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP:
			return PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT == null
					? properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap != null
					: !PROPERTIES_JAVA_LANG_STRING_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_MAP_EDEFAULT
							.equals(properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE:
			return PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT == null
					? propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference != null
					: !PROPERTY_NAMES_WITH_JSON_SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_AS_REFERENCE_EDEFAULT
							.equals(propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REF_JAVA_LANG_STRING_:
			return REF_JAVA_LANG_STRING__EDEFAULT == null ? ref_java_lang_String_ != null
					: !REF_JAVA_LANG_STRING__EDEFAULT.equals(ref_java_lang_String_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__REQUIRED_JAVA_LANG_STRING_AS_LIST:
			return REQUIRED_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? required_java_lang_String_AsList != null
					: !REQUIRED_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(required_java_lang_String_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION_:
			return schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_ != SCHEMA_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_VERSION__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TITLE_JAVA_LANG_STRING_:
			return TITLE_JAVA_LANG_STRING__EDEFAULT == null ? title_java_lang_String_ != null
					: !TITLE_JAVA_LANG_STRING__EDEFAULT.equals(title_java_lang_String_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_:
			return type_software_amazon_awscdk_services_apigateway_JsonSchemaType_ != TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE__EDEFAULT;
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST:
			return TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST_EDEFAULT == null
					? type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList != null
					: !TYPE_SOFTWARE_AMAZON_AWSCDK_SERVICES_APIGATEWAY_JSON_SCHEMA_TYPE_AS_LIST_EDEFAULT
							.equals(type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__UNIQUE_ITEMS_JAVA_LANG_BOOLEAN_:
			return UNIQUE_ITEMS_JAVA_LANG_BOOLEAN__EDEFAULT == null ? uniqueItems_java_lang_Boolean_ != null
					: !UNIQUE_ITEMS_JAVA_LANG_BOOLEAN__EDEFAULT.equals(uniqueItems_java_lang_Boolean_);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case ApigatewayPackage.JSON_SCHEMA_BUILDER_APIGATEWAY__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList: ");
		result.append(additionalItems_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		result.append(", additionalProperties_java_lang_Boolean_: ");
		result.append(additionalProperties_java_lang_Boolean_);
		result.append(", allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList: ");
		result.append(allOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		result.append(", anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList: ");
		result.append(anyOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		result.append(", containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference: ");
		result.append(containsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		result.append(", contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList: ");
		result.append(contains_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		result.append(", definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap: ");
		result.append(definitions_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap);
		result.append(", dependencies_java_lang_String__java_lang_Object_AsMap: ");
		result.append(dependencies_java_lang_String__java_lang_Object_AsMap);
		result.append(", description_java_lang_String_: ");
		result.append(description_java_lang_String_);
		result.append(", enumValue_java_lang_Object_AsList: ");
		result.append(enumValue_java_lang_Object_AsList);
		result.append(", exclusiveMaximum_java_lang_Boolean_: ");
		result.append(exclusiveMaximum_java_lang_Boolean_);
		result.append(", exclusiveMinimum_java_lang_Boolean_: ");
		result.append(exclusiveMinimum_java_lang_Boolean_);
		result.append(", format_java_lang_String_: ");
		result.append(format_java_lang_String_);
		result.append(", id_java_lang_String_: ");
		result.append(id_java_lang_String_);
		result.append(", itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference: ");
		result.append(itemsWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		result.append(", items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList: ");
		result.append(items_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		result.append(", maximum_java_lang_Number_: ");
		result.append(maximum_java_lang_Number_);
		result.append(", maxItems_java_lang_Number_: ");
		result.append(maxItems_java_lang_Number_);
		result.append(", maxLength_java_lang_Number_: ");
		result.append(maxLength_java_lang_Number_);
		result.append(", maxProperties_java_lang_Number_: ");
		result.append(maxProperties_java_lang_Number_);
		result.append(", minimum_java_lang_Number_: ");
		result.append(minimum_java_lang_Number_);
		result.append(", minItems_java_lang_Number_: ");
		result.append(minItems_java_lang_Number_);
		result.append(", minLength_java_lang_Number_: ");
		result.append(minLength_java_lang_Number_);
		result.append(", minProperties_java_lang_Number_: ");
		result.append(minProperties_java_lang_Number_);
		result.append(", multipleOf_java_lang_Number_: ");
		result.append(multipleOf_java_lang_Number_);
		result.append(", notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference: ");
		result.append(notWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		result.append(", oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList: ");
		result.append(oneOf_software_amazon_awscdk_services_apigateway_JsonSchema_AsList);
		result.append(", pattern_java_lang_String_: ");
		result.append(pattern_java_lang_String_);
		result.append(
				", patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap: ");
		result.append(patternProperties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap);
		result.append(", properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap: ");
		result.append(properties_java_lang_String__software_amazon_awscdk_services_apigateway_JsonSchema_AsMap);
		result.append(
				", propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference: ");
		result.append(propertyNamesWithJsonSchema_software_amazon_awscdk_services_apigateway_JsonSchema_AsReference);
		result.append(", ref_java_lang_String_: ");
		result.append(ref_java_lang_String_);
		result.append(", required_java_lang_String_AsList: ");
		result.append(required_java_lang_String_AsList);
		result.append(", schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_: ");
		result.append(schema_software_amazon_awscdk_services_apigateway_JsonSchemaVersion_);
		result.append(", title_java_lang_String_: ");
		result.append(title_java_lang_String_);
		result.append(", type_software_amazon_awscdk_services_apigateway_JsonSchemaType_: ");
		result.append(type_software_amazon_awscdk_services_apigateway_JsonSchemaType_);
		result.append(", type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList: ");
		result.append(type_software_amazon_awscdk_services_apigateway_JsonSchemaType_AsList);
		result.append(", uniqueItems_java_lang_Boolean_: ");
		result.append(uniqueItems_java_lang_Boolean_);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //JsonSchemaBuilder_apigatewayImpl
