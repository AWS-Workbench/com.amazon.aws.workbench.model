/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secondary Index Props Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}</li>
 *   <li>{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}</li>
 *   <li>{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}</li>
 *   <li>{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb()
 * @model
 * @generated
 */
public interface SecondaryIndexPropsBuilder_dynamodb extends EObject {
	/**
	 * Returns the value of the '<em><b>Index Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name java lang String </em>' attribute.
	 * @see #setIndexName_java_lang_String_(String)
	 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getIndexName_java_lang_String_();

	/**
	 * Sets the value of the '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Name java lang String </em>' attribute.
	 * @see #getIndexName_java_lang_String_()
	 * @generated
	 */
	void setIndexName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Non Key Attributes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Key Attributes java lang String As List</em>' attribute.
	 * @see #setNonKeyAttributes_java_lang_String_AsList(String)
	 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getNonKeyAttributes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Key Attributes java lang String As List</em>' attribute.
	 * @see #getNonKeyAttributes_java_lang_String_AsList()
	 * @generated
	 */
	void setNonKeyAttributes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Projection Type software amazon awscdk services dynamodb Projection Type </b></em>' attribute.
	 * The literals are from the enumeration {@link dynamodb.ProjectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection Type software amazon awscdk services dynamodb Projection Type </em>' attribute.
	 * @see dynamodb.ProjectionType
	 * @see #setProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_(ProjectionType)
	 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @model dataType="dynamodb.ProjectionType"
	 * @generated
	 */
	ProjectionType getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

	/**
	 * Sets the value of the '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection Type software amazon awscdk services dynamodb Projection Type </em>' attribute.
	 * @see dynamodb.ProjectionType
	 * @see #getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @generated
	 */
	void setProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_(ProjectionType value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.dynamodb.SecondaryIndexProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.dynamodb.SecondaryIndexProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getSecondaryIndexPropsBuilder_dynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link dynamodb.SecondaryIndexPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // SecondaryIndexPropsBuilder_dynamodb
