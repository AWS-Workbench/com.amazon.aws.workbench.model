/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Map Options Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference <em>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ <em>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Dns Ttl With Duration software amazon awscdk core Duration As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getFailureThreshold_java_lang_Number_ <em>Failure Threshold java lang Number </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getName_java_lang_String_ <em>Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs()
 * @model
 * @generated
 */
public interface CloudMapOptionsBuilder_ecs extends ServiceResources {
	/**
	 * Returns the value of the '<em><b>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</em>' attribute.
	 * @see #setCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_CloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference()
	 * @model
	 * @generated
	 */
	String getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference <em>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cloud Map Namespace With INamespace software amazon awscdk services servicediscovery INamespace As Reference</em>' attribute.
	 * @see #getCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference()
	 * @generated
	 */
	void setCloudMapNamespaceWithINamespace_software_amazon_awscdk_services_servicediscovery_INamespace_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </b></em>' attribute.
	 * The literals are from the enumeration {@link com.amazon.aws.workbench.model.awsworkbench.DnsRecordType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DnsRecordType
	 * @see #setDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_(DnsRecordType)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_DnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_()
	 * @model dataType="com.amazon.aws.workbench.model.awsworkbench.DnsRecordType"
	 * @generated
	 */
	DnsRecordType getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_ <em>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Record Type software amazon awscdk services servicediscovery Dns Record Type </em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.DnsRecordType
	 * @see #getDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_()
	 * @generated
	 */
	void setDnsRecordType_software_amazon_awscdk_services_servicediscovery_DnsRecordType_(DnsRecordType value);

	/**
	 * Returns the value of the '<em><b>Dns Ttl With Duration software amazon awscdk core Duration As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dns Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #setDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_DnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @model
	 * @generated
	 */
	String getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference <em>Dns Ttl With Duration software amazon awscdk core Duration As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dns Ttl With Duration software amazon awscdk core Duration As Reference</em>' attribute.
	 * @see #getDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference()
	 * @generated
	 */
	void setDnsTtlWithDuration_software_amazon_awscdk_core_Duration_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Failure Threshold java lang Number </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure Threshold java lang Number </em>' attribute.
	 * @see #setFailureThreshold_java_lang_Number_(int)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_FailureThreshold_java_lang_Number_()
	 * @model
	 * @generated
	 */
	int getFailureThreshold_java_lang_Number_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getFailureThreshold_java_lang_Number_ <em>Failure Threshold java lang Number </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failure Threshold java lang Number </em>' attribute.
	 * @see #getFailureThreshold_java_lang_Number_()
	 * @generated
	 */
	void setFailureThreshold_java_lang_Number_(int value);

	/**
	 * Returns the value of the '<em><b>Name java lang String </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name java lang String </em>' attribute.
	 * @see #setName_java_lang_String_(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_Name_java_lang_String_()
	 * @model
	 * @generated
	 */
	String getName_java_lang_String_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getName_java_lang_String_ <em>Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name java lang String </em>' attribute.
	 * @see #getName_java_lang_String_()
	 * @generated
	 */
	void setName_java_lang_String_(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ecs.CloudMapOptions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ecs.CloudMapOptions" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getCloudMapOptionsBuilder_ecs_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.CloudMapOptionsBuilder_ecs#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // CloudMapOptionsBuilder_ecs
