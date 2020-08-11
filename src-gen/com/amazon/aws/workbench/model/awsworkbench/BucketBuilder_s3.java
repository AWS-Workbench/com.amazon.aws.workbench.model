/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bucket Builder s3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ <em>Access Control software amazon awscdk services s3 Bucket Access Control </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference <em>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getBucketName_java_lang_String_ <em>Bucket Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getCors_software_amazon_awscdk_services_s3_CorsRule_AsList <em>Cors software amazon awscdk services s3 Cors Rule As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_ <em>Encryption software amazon awscdk services s3 Bucket Encryption </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList <em>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList <em>Metrics software amazon awscdk services s3 Bucket Metrics As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getPublicReadAccess_java_lang_Boolean_ <em>Public Read Access java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getServerAccessLogsPrefix_java_lang_String_ <em>Server Access Logs Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getVersioned_java_lang_Boolean_ <em>Versioned java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteErrorDocument_java_lang_String_ <em>Website Error Document java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteIndexDocument_java_lang_String_ <em>Website Index Document java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference <em>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList <em>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3()
 * @model
 * @generated
 */
public interface BucketBuilder_s3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Access Control software amazon awscdk services s3 Bucket Access Control </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.BucketAccessControl}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Control software amazon awscdk services s3 Bucket Access Control </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BucketAccessControl
	 * @see #setAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_(BucketAccessControl)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_AccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.BucketAccessControl"
	 * @generated
	 */
	BucketAccessControl getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_ <em>Access Control software amazon awscdk services s3 Bucket Access Control </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Access Control software amazon awscdk services s3 Bucket Access Control </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BucketAccessControl
	 * @see #getAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_()
	 * @generated
	 */
	void setAccessControl_software_amazon_awscdk_services_s3_BucketAccessControl_(BucketAccessControl value);

	/**
	 * Returns the value of the '<em><b>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</em>' attribute.
	 * @see #setBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_BlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference()
	 * @model
	 * @generated
	 */
	String getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference <em>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Public Access With Block Public Access software amazon awscdk services s3 Block Public Access As Reference</em>' attribute.
	 * @see #getBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference()
	 * @generated
	 */
	void setBlockPublicAccessWithBlockPublicAccess_software_amazon_awscdk_services_s3_BlockPublicAccess_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Bucket Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Name java lang String </em>' attribute.
	 * @see #setBucketName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_BucketName_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getBucketName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getBucketName_java_lang_String_ <em>Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Name java lang String </em>' attribute.
	 * @see #getBucketName_java_lang_String_()
	 * @generated
	 */
	void setBucketName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Cors software amazon awscdk services s3 Cors Rule As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cors software amazon awscdk services s3 Cors Rule As List</em>' attribute.
	 * @see #setCors_software_amazon_awscdk_services_s3_CorsRule_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_Cors_software_amazon_awscdk_services_s3_CorsRule_AsList()
	 * @model
	 * @generated
	 */
	String getCors_software_amazon_awscdk_services_s3_CorsRule_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getCors_software_amazon_awscdk_services_s3_CorsRule_AsList <em>Cors software amazon awscdk services s3 Cors Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cors software amazon awscdk services s3 Cors Rule As List</em>' attribute.
	 * @see #getCors_software_amazon_awscdk_services_s3_CorsRule_AsList()
	 * @generated
	 */
	void setCors_software_amazon_awscdk_services_s3_CorsRule_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Encryption software amazon awscdk services s3 Bucket Encryption </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.BucketEncryption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption software amazon awscdk services s3 Bucket Encryption </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BucketEncryption
	 * @see #setEncryption_software_amazon_awscdk_services_s3_BucketEncryption_(BucketEncryption)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_Encryption_software_amazon_awscdk_services_s3_BucketEncryption_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.BucketEncryption"
	 * @generated
	 */
	BucketEncryption getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_ <em>Encryption software amazon awscdk services s3 Bucket Encryption </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption software amazon awscdk services s3 Bucket Encryption </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.BucketEncryption
	 * @see #getEncryption_software_amazon_awscdk_services_s3_BucketEncryption_()
	 * @generated
	 */
	void setEncryption_software_amazon_awscdk_services_s3_BucketEncryption_(BucketEncryption value);

	/**
	 * Returns the value of the '<em><b>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_EncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @model
	 * @generated
	 */
	String getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference <em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Key With IKey software amazon awscdk services kms IKey As Reference</em>' attribute.
	 * @see #getEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference()
	 * @generated
	 */
	void setEncryptionKeyWithIKey_software_amazon_awscdk_services_kms_IKey_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</em>' attribute.
	 * @see #setLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_LifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList()
	 * @model
	 * @generated
	 */
	String getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList <em>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifecycle Rules software amazon awscdk services s3 Lifecycle Rule As List</em>' attribute.
	 * @see #getLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList()
	 * @generated
	 */
	void setLifecycleRules_software_amazon_awscdk_services_s3_LifecycleRule_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Metrics software amazon awscdk services s3 Bucket Metrics As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics software amazon awscdk services s3 Bucket Metrics As List</em>' attribute.
	 * @see #setMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_Metrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList()
	 * @model
	 * @generated
	 */
	String getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList <em>Metrics software amazon awscdk services s3 Bucket Metrics As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metrics software amazon awscdk services s3 Bucket Metrics As List</em>' attribute.
	 * @see #getMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList()
	 * @generated
	 */
	void setMetrics_software_amazon_awscdk_services_s3_BucketMetrics_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Public Read Access java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Read Access java lang Boolean </em>' attribute.
	 * @see #setPublicReadAccess_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_PublicReadAccess_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getPublicReadAccess_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getPublicReadAccess_java_lang_Boolean_ <em>Public Read Access java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Read Access java lang Boolean </em>' attribute.
	 * @see #getPublicReadAccess_java_lang_Boolean_()
	 * @generated
	 */
	void setPublicReadAccess_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Removal Policy software amazon awscdk core Removal Policy </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_RemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy"
	 * @generated
	 */
	RemovalPolicy getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_ <em>Removal Policy software amazon awscdk core Removal Policy </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removal Policy software amazon awscdk core Removal Policy </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.RemovalPolicy
	 * @see #getRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_()
	 * @generated
	 */
	void setRemovalPolicy_software_amazon_awscdk_core_RemovalPolicy_(RemovalPolicy value);

	/**
	 * Returns the value of the '<em><b>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #setServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_ServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @model
	 * @generated
	 */
	String getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Access Logs Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #getServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 */
	void setServerAccessLogsBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Server Access Logs Prefix java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Access Logs Prefix java lang String </em>' attribute.
	 * @see #setServerAccessLogsPrefix_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_ServerAccessLogsPrefix_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getServerAccessLogsPrefix_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getServerAccessLogsPrefix_java_lang_String_ <em>Server Access Logs Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Access Logs Prefix java lang String </em>' attribute.
	 * @see #getServerAccessLogsPrefix_java_lang_String_()
	 * @generated
	 */
	void setServerAccessLogsPrefix_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Versioned java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versioned java lang Boolean </em>' attribute.
	 * @see #setVersioned_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_Versioned_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getVersioned_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getVersioned_java_lang_Boolean_ <em>Versioned java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versioned java lang Boolean </em>' attribute.
	 * @see #getVersioned_java_lang_Boolean_()
	 * @generated
	 */
	void setVersioned_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Website Error Document java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website Error Document java lang String </em>' attribute.
	 * @see #setWebsiteErrorDocument_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_WebsiteErrorDocument_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getWebsiteErrorDocument_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteErrorDocument_java_lang_String_ <em>Website Error Document java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Error Document java lang String </em>' attribute.
	 * @see #getWebsiteErrorDocument_java_lang_String_()
	 * @generated
	 */
	void setWebsiteErrorDocument_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Website Index Document java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website Index Document java lang String </em>' attribute.
	 * @see #setWebsiteIndexDocument_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_WebsiteIndexDocument_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getWebsiteIndexDocument_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteIndexDocument_java_lang_String_ <em>Website Index Document java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Index Document java lang String </em>' attribute.
	 * @see #getWebsiteIndexDocument_java_lang_String_()
	 * @generated
	 */
	void setWebsiteIndexDocument_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</em>' attribute.
	 * @see #setWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_WebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference()
	 * @model
	 * @generated
	 */
	String getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference <em>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Redirect With Redirect Target software amazon awscdk services s3 Redirect Target As Reference</em>' attribute.
	 * @see #getWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference()
	 * @generated
	 */
	void setWebsiteRedirectWithRedirectTarget_software_amazon_awscdk_services_s3_RedirectTarget_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</em>' attribute.
	 * @see #setWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_WebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList()
	 * @model
	 * @generated
	 */
	String getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList <em>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Website Routing Rules software amazon awscdk services s3 Routing Rule As List</em>' attribute.
	 * @see #getWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList()
	 * @generated
	 */
	void setWebsiteRoutingRules_software_amazon_awscdk_services_s3_RoutingRule_AsList(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.s3.Bucket"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.s3.Bucket" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBucketBuilder_s3_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BucketBuilder_s3#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BucketBuilder_s3
