/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lifecycle Rule Builder s3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Expiration With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getExpirationDateWithInstant_java_time_Instant_AsReference <em>Expiration Date With Instant java time Instant As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getId_java_lang_String_ <em>Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList <em>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getTagFilters_java_lang_String__java_lang_Object_AsMap <em>Tag Filters java lang String java lang Object As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getTransitions_software_amazon_awscdk_services_s3_Transition_AsList <em>Transitions software amazon awscdk services s3 Transition As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3()
 * @model
 * @generated
 */
public interface LifecycleRuleBuilder_s3 extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_AbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abort Incomplete Multipart Upload After With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setAbortIncompleteMultipartUploadAfterWithDuration_software_amazon_awscdk_core_Duration_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Enabled java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled java lang Boolean </em>' attribute.
	 * @see #setEnabled_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_Enabled_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getEnabled_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getEnabled_java_lang_Boolean_ <em>Enabled java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled java lang Boolean </em>' attribute.
	 * @see #getEnabled_java_lang_Boolean_()
	 * @generated
	 */
	void setEnabled_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Expiration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_ExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Expiration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Date With Instant java time Instant As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Date With Instant java time Instant As Reference</em>' attribute.
	 * @see #setExpirationDateWithInstant_java_time_Instant_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_ExpirationDateWithInstant_java_time_Instant_AsReference()
	 * @model
	 * @generated
	 */
	String getExpirationDateWithInstant_java_time_Instant_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getExpirationDateWithInstant_java_time_Instant_AsReference <em>Expiration Date With Instant java time Instant As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Date With Instant java time Instant As Reference</em>' attribute.
	 * @see #getExpirationDateWithInstant_java_time_Instant_AsReference()
	 * @generated
	 */
	void setExpirationDateWithInstant_java_time_Instant_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Id java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id java lang String </em>' attribute.
	 * @see #setId_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_Id_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getId_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getId_java_lang_String_ <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id java lang String </em>' attribute.
	 * @see #getId_java_lang_String_()
	 * @generated
	 */
	void setId_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_NoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noncurrent Version Expiration With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setNoncurrentVersionExpirationWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</em>' attribute.
	 * @see #setNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_NoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList()
	 * @model
	 * @generated
	 */
	String getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList <em>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Noncurrent Version Transitions software amazon awscdk services s3 Noncurrent Version Transition As List</em>' attribute.
	 * @see #getNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList()
	 * @generated
	 */
	void setNoncurrentVersionTransitions_software_amazon_awscdk_services_s3_NoncurrentVersionTransition_AsList(
			String value);

	/**
	 * Returns the value of the '<em><b>Prefix java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix java lang String </em>' attribute.
	 * @see #setPrefix_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_Prefix_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getPrefix_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_TagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @model
	 * @generated
	 */
	String getTagFilters_java_lang_String__java_lang_Object_AsMap();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getTagFilters_java_lang_String__java_lang_Object_AsMap <em>Tag Filters java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Filters java lang String java lang Object As Map</em>' attribute.
	 * @see #getTagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 */
	void setTagFilters_java_lang_String__java_lang_Object_AsMap(String value);

	/**
	 * Returns the value of the '<em><b>Transitions software amazon awscdk services s3 Transition As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions software amazon awscdk services s3 Transition As List</em>' attribute.
	 * @see #setTransitions_software_amazon_awscdk_services_s3_Transition_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_Transitions_software_amazon_awscdk_services_s3_Transition_AsList()
	 * @model
	 * @generated
	 */
	String getTransitions_software_amazon_awscdk_services_s3_Transition_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getTransitions_software_amazon_awscdk_services_s3_Transition_AsList <em>Transitions software amazon awscdk services s3 Transition As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transitions software amazon awscdk services s3 Transition As List</em>' attribute.
	 * @see #getTransitions_software_amazon_awscdk_services_s3_Transition_AsList()
	 * @generated
	 */
	void setTransitions_software_amazon_awscdk_services_s3_Transition_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.s3.LifecycleRule"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.s3.LifecycleRule" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getLifecycleRuleBuilder_s3_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.LifecycleRuleBuilder_s3#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // LifecycleRuleBuilder_s3
