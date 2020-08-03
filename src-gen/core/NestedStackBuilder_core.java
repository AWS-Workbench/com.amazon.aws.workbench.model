/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nested Stack Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.NestedStackBuilder_core#getNotificationArns_java_lang_String_AsList <em>Notification Arns java lang String As List</em>}</li>
 *   <li>{@link core.NestedStackBuilder_core#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}</li>
 *   <li>{@link core.NestedStackBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link core.NestedStackBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.NestedStackBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.NestedStackBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.NestedStackBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getNestedStackBuilder_core()
 * @model
 * @generated
 */
public interface NestedStackBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Notification Arns java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification Arns java lang String As List</em>' attribute.
	 * @see #setNotificationArns_java_lang_String_AsList(String)
	 * @see core.CorePackage#getNestedStackBuilder_core_NotificationArns_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getNotificationArns_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link core.NestedStackBuilder_core#getNotificationArns_java_lang_String_AsList <em>Notification Arns java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification Arns java lang String As List</em>' attribute.
	 * @see #getNotificationArns_java_lang_String_AsList()
	 * @generated
	 */
	void setNotificationArns_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Parameters java lang String java lang String As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #setParameters_java_lang_String__java_lang_String_AsMap(String)
	 * @see core.CorePackage#getNestedStackBuilder_core_Parameters_java_lang_String__java_lang_String_AsMap()
	 * @model
	 * @generated
	 */
	String getParameters_java_lang_String__java_lang_String_AsMap();

	/**
	 * Sets the value of the '{@link core.NestedStackBuilder_core#getParameters_java_lang_String__java_lang_String_AsMap <em>Parameters java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameters java lang String java lang String As Map</em>' attribute.
	 * @see #getParameters_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 */
	void setParameters_java_lang_String__java_lang_String_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Timeout With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see core.CorePackage#getNestedStackBuilder_core_TimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link core.NestedStackBuilder_core#getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Timeout With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setTimeoutWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.NestedStack"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getNestedStackBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.NestedStack" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getNestedStackBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.NestedStackBuilder_core#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see core.CorePackage#getNestedStackBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.NestedStackBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Additional Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Code</em>' attribute.
	 * @see #setAdditionalCode(String)
	 * @see core.CorePackage#getNestedStackBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.NestedStackBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // NestedStackBuilder_core
