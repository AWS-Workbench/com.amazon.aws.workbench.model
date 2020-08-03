/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Attributes Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getGlobalIndexes_java_lang_String_AsList <em>Global Indexes java lang String As List</em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getLocalIndexes_java_lang_String_AsList <em>Local Indexes java lang String As List</em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getTableArn_java_lang_String_ <em>Table Arn java lang String </em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getTableName_java_lang_String_ <em>Table Name java lang String </em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getTableStreamArn_java_lang_String_ <em>Table Stream Arn java lang String </em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.TableAttributesBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb()
 * @model
 * @generated
 */
public interface TableAttributesBuilder_dynamodb extends EObject {
	/**
	 * Returns the value of the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Global Indexes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Indexes java lang String As List</em>' attribute.
	 * @see #setGlobalIndexes_java_lang_String_AsList(String)
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_GlobalIndexes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getGlobalIndexes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getGlobalIndexes_java_lang_String_AsList <em>Global Indexes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Indexes java lang String As List</em>' attribute.
	 * @see #getGlobalIndexes_java_lang_String_AsList()
	 * @generated
	 */
	void setGlobalIndexes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Local Indexes java lang String As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Indexes java lang String As List</em>' attribute.
	 * @see #setLocalIndexes_java_lang_String_AsList(String)
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_LocalIndexes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getLocalIndexes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getLocalIndexes_java_lang_String_AsList <em>Local Indexes java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Indexes java lang String As List</em>' attribute.
	 * @see #getLocalIndexes_java_lang_String_AsList()
	 * @generated
	 */
	void setLocalIndexes_java_lang_String_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Table Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Arn java lang String </em>' attribute.
	 * @see #setTableArn_java_lang_String_(String)
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_TableArn_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTableArn_java_lang_String_();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getTableArn_java_lang_String_ <em>Table Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Arn java lang String </em>' attribute.
	 * @see #getTableArn_java_lang_String_()
	 * @generated
	 */
	void setTableArn_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Table Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name java lang String </em>' attribute.
	 * @see #setTableName_java_lang_String_(String)
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_TableName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTableName_java_lang_String_();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getTableName_java_lang_String_ <em>Table Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name java lang String </em>' attribute.
	 * @see #getTableName_java_lang_String_()
	 * @generated
	 */
	void setTableName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Table Stream Arn java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Stream Arn java lang String </em>' attribute.
	 * @see #setTableStreamArn_java_lang_String_(String)
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_TableStreamArn_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getTableStreamArn_java_lang_String_();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getTableStreamArn_java_lang_String_ <em>Table Stream Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Stream Arn java lang String </em>' attribute.
	 * @see #getTableStreamArn_java_lang_String_()
	 * @generated
	 */
	void setTableStreamArn_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.dynamodb.TableAttributes"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.dynamodb.TableAttributes" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getTableAttributesBuilder_dynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link dynamodb.TableAttributesBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // TableAttributesBuilder_dynamodb
