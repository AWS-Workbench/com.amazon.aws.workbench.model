/**
 */
package dynamodb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Secondary Index Props Builder dynamodb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getVarName <em>Var Name</em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb()
 * @model
 * @generated
 */
public interface GlobalSecondaryIndexPropsBuilder_dynamodb extends EObject {
	/**
	 * Returns the value of the '<em><b>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #setPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String)
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_PartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @model
	 * @generated
	 */
	String getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partition Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #getPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 */
	void setPartitionKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Read Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Capacity java lang Number </em>' attribute.
	 * @see #setReadCapacity_java_lang_Number_(int)
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_ReadCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getReadCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getReadCapacity_java_lang_Number_ <em>Read Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Capacity java lang Number </em>' attribute.
	 * @see #getReadCapacity_java_lang_Number_()
	 * @generated
	 */
	void setReadCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String)
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_SortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @model
	 * @generated
	 */
	String getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference <em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Key With Attribute software amazon awscdk services dynamodb Attribute As Reference</em>' attribute.
	 * @see #getSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference()
	 * @generated
	 */
	void setSortKeyWithAttribute_software_amazon_awscdk_services_dynamodb_Attribute_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Write Capacity java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Write Capacity java lang Number </em>' attribute.
	 * @see #setWriteCapacity_java_lang_Number_(int)
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_WriteCapacity_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getWriteCapacity_java_lang_Number_();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getWriteCapacity_java_lang_Number_ <em>Write Capacity java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Write Capacity java lang Number </em>' attribute.
	 * @see #getWriteCapacity_java_lang_Number_()
	 * @generated
	 */
	void setWriteCapacity_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Index Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Name java lang String </em>' attribute.
	 * @see #setIndexName_java_lang_String_(String)
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_IndexName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getIndexName_java_lang_String_();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIndexName_java_lang_String_ <em>Index Name java lang String </em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_NonKeyAttributes_java_lang_String_AsList()
	 * @model
	 * @generated
	 */
	String getNonKeyAttributes_java_lang_String_AsList();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getNonKeyAttributes_java_lang_String_AsList <em>Non Key Attributes java lang String As List</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_ProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_()
	 * @model dataType="dynamodb.ProjectionType"
	 * @generated
	 */
	ProjectionType getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getProjectionType_software_amazon_awscdk_services_dynamodb_ProjectionType_ <em>Projection Type software amazon awscdk services dynamodb Projection Type </em>}' attribute.
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
	 * The default value is <code>"software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.dynamodb.GlobalSecondaryIndexProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getVarName <em>Var Name</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see dynamodb.DynamodbPackage#getGlobalSecondaryIndexPropsBuilder_dynamodb_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link dynamodb.GlobalSecondaryIndexPropsBuilder_dynamodb#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // GlobalSecondaryIndexPropsBuilder_dynamodb
