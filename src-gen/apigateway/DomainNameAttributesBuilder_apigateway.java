/**
 */
package apigateway;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Name Attributes Builder apigateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link apigateway.DomainNameAttributesBuilder_apigateway#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}</li>
 *   <li>{@link apigateway.DomainNameAttributesBuilder_apigateway#getDomainNameAliasHostedZoneId_java_lang_String_ <em>Domain Name Alias Hosted Zone Id java lang String </em>}</li>
 *   <li>{@link apigateway.DomainNameAttributesBuilder_apigateway#getDomainNameAliasTarget_java_lang_String_ <em>Domain Name Alias Target java lang String </em>}</li>
 *   <li>{@link apigateway.DomainNameAttributesBuilder_apigateway#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link apigateway.DomainNameAttributesBuilder_apigateway#getVarName <em>Var Name</em>}</li>
 *   <li>{@link apigateway.DomainNameAttributesBuilder_apigateway#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link apigateway.DomainNameAttributesBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway()
 * @model
 * @generated
 */
public interface DomainNameAttributesBuilder_apigateway extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #setDomainName_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway_DomainName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainName_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.DomainNameAttributesBuilder_apigateway#getDomainName_java_lang_String_ <em>Domain Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name java lang String </em>' attribute.
	 * @see #getDomainName_java_lang_String_()
	 * @generated
	 */
	void setDomainName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name Alias Hosted Zone Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name Alias Hosted Zone Id java lang String </em>' attribute.
	 * @see #setDomainNameAliasHostedZoneId_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway_DomainNameAliasHostedZoneId_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainNameAliasHostedZoneId_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.DomainNameAttributesBuilder_apigateway#getDomainNameAliasHostedZoneId_java_lang_String_ <em>Domain Name Alias Hosted Zone Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name Alias Hosted Zone Id java lang String </em>' attribute.
	 * @see #getDomainNameAliasHostedZoneId_java_lang_String_()
	 * @generated
	 */
	void setDomainNameAliasHostedZoneId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Domain Name Alias Target java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name Alias Target java lang String </em>' attribute.
	 * @see #setDomainNameAliasTarget_java_lang_String_(String)
	 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway_DomainNameAliasTarget_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getDomainNameAliasTarget_java_lang_String_();

	/**
	 * Sets the value of the '{@link apigateway.DomainNameAttributesBuilder_apigateway#getDomainNameAliasTarget_java_lang_String_ <em>Domain Name Alias Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name Alias Target java lang String </em>' attribute.
	 * @see #getDomainNameAliasTarget_java_lang_String_()
	 * @generated
	 */
	void setDomainNameAliasTarget_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.apigateway.DomainNameAttributes"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.apigateway.DomainNameAttributes" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link apigateway.DomainNameAttributesBuilder_apigateway#getVarName <em>Var Name</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link apigateway.DomainNameAttributesBuilder_apigateway#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see apigateway.ApigatewayPackage#getDomainNameAttributesBuilder_apigateway_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link apigateway.DomainNameAttributesBuilder_apigateway#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // DomainNameAttributesBuilder_apigateway
