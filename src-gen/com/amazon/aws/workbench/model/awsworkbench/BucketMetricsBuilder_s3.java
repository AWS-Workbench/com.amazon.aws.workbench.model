/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bucket Metrics Builder s3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getId_java_lang_String_ <em>Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getTagFilters_java_lang_String__java_lang_Object_AsMap <em>Tag Filters java lang String java lang Object As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3()
 * @model
 * @generated
 */
public interface BucketMetricsBuilder_s3 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id java lang String </em>' attribute.
	 * @see #setId_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3_Id_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getId_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getId_java_lang_String_ <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id java lang String </em>' attribute.
	 * @see #getId_java_lang_String_()
	 * @generated
	 */
	void setId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Prefix java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix java lang String </em>' attribute.
	 * @see #setPrefix_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3_Prefix_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPrefix_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix java lang String </em>' attribute.
	 * @see #getPrefix_java_lang_String_()
	 * @generated
	 */
	void setPrefix_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Tag Filters java lang String java lang Object As Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Filters java lang String java lang Object As Map</em>' attribute.
	 * @see #setTagFilters_java_lang_String__java_lang_Object_AsMap(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3_TagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @model
	 * @generated
	 */
	String getTagFilters_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getTagFilters_java_lang_String__java_lang_Object_AsMap <em>Tag Filters java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Filters java lang String java lang Object As Map</em>' attribute.
	 * @see #getTagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 */
	void setTagFilters_java_lang_String__java_lang_Object_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.s3.BucketMetrics"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.s3.BucketMetrics" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketMetricsBuilder_s3_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BucketMetricsBuilder_s3
