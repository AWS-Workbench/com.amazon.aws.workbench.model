/**
 */
package ec2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Log Destination Config Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ <em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>}</li>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>}</li>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}</li>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.FlowLogDestinationConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2()
 * @model
 * @generated
 */
public interface FlowLogDestinationConfigBuilder_ec2 extends EObject {
	/**
	 * Returns the value of the '<em><b>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </b></em>' attribute.
	 * The literals are from the enumeration {@link ec2.FlowLogDestinationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>' attribute.
	 * @see ec2.FlowLogDestinationType
	 * @see #setLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_(FlowLogDestinationType)
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_LogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_()
	 * @model dataType="ec2.FlowLogDestinationType"
	 * @generated
	 */
	FlowLogDestinationType getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_();

	/**
	 * Sets the value of the '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_ <em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Destination Type software amazon awscdk services ec2 Flow Log Destination Type </em>' attribute.
	 * @see ec2.FlowLogDestinationType
	 * @see #getLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_()
	 * @generated
	 */
	void setLogDestinationType_software_amazon_awscdk_services_ec2_FlowLogDestinationType_(
			FlowLogDestinationType value);

	/**
	 * Returns the value of the '<em><b>Iam Role With IRole software amazon awscdk services iam IRole As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #setIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String)
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_IamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @model
	 * @generated
	 */
	String getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference();

	/**
	 * Sets the value of the '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference <em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iam Role With IRole software amazon awscdk services iam IRole As Reference</em>' attribute.
	 * @see #getIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference()
	 * @generated
	 */
	void setIamRoleWithIRole_software_amazon_awscdk_services_iam_IRole_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>' attribute.
	 * @see #setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(String)
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_LogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference()
	 * @model
	 * @generated
	 */
	String getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference();

	/**
	 * Sets the value of the '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference <em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Group With ILog Group software amazon awscdk services logs ILog Group As Reference</em>' attribute.
	 * @see #getLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference()
	 * @generated
	 */
	void setLogGroupWithILogGroup_software_amazon_awscdk_services_logs_ILogGroup_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #setS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String)
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_S3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @model
	 * @generated
	 */
	String getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

	/**
	 * Sets the value of the '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S3 Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #getS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 */
	void setS3BucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.ec2.FlowLogDestinationConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.ec2.FlowLogDestinationConfig" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getVarName <em>Var Name</em>}' attribute.
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
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see ec2.Ec2Package#getFlowLogDestinationConfigBuilder_ec2_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link ec2.FlowLogDestinationConfigBuilder_ec2#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // FlowLogDestinationConfigBuilder_ec2
