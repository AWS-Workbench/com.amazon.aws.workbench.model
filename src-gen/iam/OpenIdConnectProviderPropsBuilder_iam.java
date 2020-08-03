/**
 */
package iam;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Open Id Connect Provider Props Builder iam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iam.OpenIdConnectProviderPropsBuilder_iam#getUrl_java_lang_String_ <em>Url java lang String </em>}</li>
 *   <li>{@link iam.OpenIdConnectProviderPropsBuilder_iam#getClientIds_java_lang_String_AsList <em>Client Ids java lang String As List</em>}</li>
 *   <li>{@link iam.OpenIdConnectProviderPropsBuilder_iam#getThumbprints_java_lang_String_AsList <em>Thumbprints java lang String As List</em>}</li>
 *   <li>{@link iam.OpenIdConnectProviderPropsBuilder_iam#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.OpenIdConnectProviderPropsBuilder_iam#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.OpenIdConnectProviderPropsBuilder_iam#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.OpenIdConnectProviderPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam()
 * @model
 * @generated
 */
public interface OpenIdConnectProviderPropsBuilder_iam extends EObject {
	/**
	 * Returns the value of the '<em><b>Url java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url java lang String </em>' attribute.
	 * @see #setUrl_java_lang_String_(String)
	 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam_Url_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getUrl_java_lang_String_();

	/**
	 * Sets the value of the '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getUrl_java_lang_String_ <em>Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url java lang String </em>' attribute.
	 * @see #getUrl_java_lang_String_()
	 * @generated
	 */
	void setUrl_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Client Ids java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Ids java lang String As List</em>' attribute.
	 * @see #setClientIds_java_lang_String_AsList(String)
	 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam_ClientIds_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getClientIds_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getClientIds_java_lang_String_AsList <em>Client Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Ids java lang String As List</em>' attribute.
	 * @see #getClientIds_java_lang_String_AsList()
	 * @generated
	 */
	void setClientIds_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Thumbprints java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thumbprints java lang String As List</em>' attribute.
	 * @see #setThumbprints_java_lang_String_AsList(String)
	 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam_Thumbprints_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getThumbprints_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getThumbprints_java_lang_String_AsList <em>Thumbprints java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thumbprints java lang String As List</em>' attribute.
	 * @see #getThumbprints_java_lang_String_AsList()
	 * @generated
	 */
	void setThumbprints_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.iam.OpenIdConnectProviderProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.iam.OpenIdConnectProviderProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getVarName <em>Var Name</em>}' attribute.
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
	 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see iam.IamPackage#getOpenIdConnectProviderPropsBuilder_iam_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link iam.OpenIdConnectProviderPropsBuilder_iam#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // OpenIdConnectProviderPropsBuilder_iam
