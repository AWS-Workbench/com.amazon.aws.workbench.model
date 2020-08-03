/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.AttributeBuilder_dynamodb#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link dynamodb.AttributeBuilder_dynamodb#getType_software_amazon_awscdk_services_dynamodb_AttributeType_ <em>Type software amazon awscdk services dynamodb Attribute Type </em>}</li>
 *   <li>{@link dynamodb.AttributeBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.AttributeBuilder_dynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.AttributeBuilder_dynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.AttributeBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see dynamodb.DynamodbPackage#getAttributeBuilder_dynamodb()
 * @model
 * @generated
 */
public interface AttributeBuilder_dynamodb extends EObject {
	/**
	 * Returns the value of the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name java lang String </em>' attribute.
	 * @see #setName_java_lang_String_(String)
	 * @see dynamodb.DynamodbPackage#getAttributeBuilder_dynamodb_Name_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getName_java_lang_String_();

	/**
	 * Sets the value of the '{@link dynamodb.AttributeBuilder_dynamodb#getName_java_lang_String_ <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name java lang String </em>' attribute.
	 * @see #getName_java_lang_String_()
	 * @generated
	 */
	void setName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Type software amazon awscdk services dynamodb Attribute Type </b></em>' attribute.
	 * The literals are from the enumeration {@link dynamodb.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type software amazon awscdk services dynamodb Attribute Type </em>' attribute.
	 * @see dynamodb.AttributeType
	 * @see #setType_software_amazon_awscdk_services_dynamodb_AttributeType_(AttributeType)
	 * @see dynamodb.DynamodbPackage#getAttributeBuilder_dynamodb_Type_software_amazon_awscdk_services_dynamodb_AttributeType_()
	 * @model dataType="dynamodb.AttributeType"
	 * @generated
	 */
	AttributeType getType_software_amazon_awscdk_services_dynamodb_AttributeType_();

	/**
	 * Sets the value of the '{@link dynamodb.AttributeBuilder_dynamodb#getType_software_amazon_awscdk_services_dynamodb_AttributeType_ <em>Type software amazon awscdk services dynamodb Attribute Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type software amazon awscdk services dynamodb Attribute Type </em>' attribute.
	 * @see dynamodb.AttributeType
	 * @see #getType_software_amazon_awscdk_services_dynamodb_AttributeType_()
	 * @generated
	 */
	void setType_software_amazon_awscdk_services_dynamodb_AttributeType_(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.dynamodb.Attribute"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see dynamodb.DynamodbPackage#getAttributeBuilder_dynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.dynamodb.Attribute" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see dynamodb.DynamodbPackage#getAttributeBuilder_dynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link dynamodb.AttributeBuilder_dynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getAttributeBuilder_dynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link dynamodb.AttributeBuilder_dynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getAttributeBuilder_dynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link dynamodb.AttributeBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // AttributeBuilder_dynamodb
