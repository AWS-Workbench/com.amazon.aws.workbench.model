/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Resource Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getServiceToken_java_lang_String_ <em>Service Token java lang String </em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getPascalCaseProperties_java_lang_Boolean_ <em>Pascal Case Properties java lang Boolean </em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getProperties_java_lang_String__java_lang_Object_AsMap <em>Properties java lang String java lang Object As Map</em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getResourceType_java_lang_String_ <em>Resource Type java lang String </em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.CustomResourcePropsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getCustomResourcePropsBuilder_core()
 * @model
 * @generated
 */
public interface CustomResourcePropsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Service Token java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Token java lang String </em>' attribute.
	 * @see #setServiceToken_java_lang_String_(String)
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_ServiceToken_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getServiceToken_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getServiceToken_java_lang_String_ <em>Service Token java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Token java lang String </em>' attribute.
	 * @see #getServiceToken_java_lang_String_()
	 * @generated
	 */
	void setServiceToken_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Pascal Case Properties java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pascal Case Properties java lang Boolean </em>' attribute.
	 * @see #setPascalCaseProperties_java_lang_Boolean_(Boolean)
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_PascalCaseProperties_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPascalCaseProperties_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getPascalCaseProperties_java_lang_Boolean_ <em>Pascal Case Properties java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pascal Case Properties java lang Boolean </em>' attribute.
	 * @see #getPascalCaseProperties_java_lang_Boolean_()
	 * @generated
	 */
	void setPascalCaseProperties_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Properties java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties java lang String java lang Object As Map</em>' attribute.
	 * @see #setProperties_java_lang_String__java_lang_Object_AsMap(String)
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_Properties_java_lang_String__java_lang_Object_AsMap()
	 * @model
	 * @generated
	 */
	String getProperties_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getProperties_java_lang_String__java_lang_Object_AsMap <em>Properties java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties java lang String java lang Object As Map</em>' attribute.
	 * @see #getProperties_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 */
	void setProperties_java_lang_String__java_lang_Object_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link core.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see core.RemovalPolicy
	 * @see #setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="core.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see core.RemovalPolicy
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Resource Type java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Type java lang String </em>' attribute.
	 * @see #setResourceType_java_lang_String_(String)
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_ResourceType_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getResourceType_java_lang_String_();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getResourceType_java_lang_String_ <em>Resource Type java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Type java lang String </em>' attribute.
	 * @see #getResourceType_java_lang_String_()
	 * @generated
	 */
	void setResourceType_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.core.CustomResourceProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.core.CustomResourceProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see core.CorePackage#getCustomResourcePropsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link core.CustomResourcePropsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CustomResourcePropsBuilder_core
