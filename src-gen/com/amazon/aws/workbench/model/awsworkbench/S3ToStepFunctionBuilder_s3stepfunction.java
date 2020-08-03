/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S3 To Step Function Builder s3stepfunction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference <em>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getDeployCloudTrail_java_lang_Boolean_ <em>Deploy Cloud Trail java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction()
 * @model
 * @generated
 */
public interface S3ToStepFunctionBuilder_s3stepfunction extends EObject {
	/**
	 * Returns the value of the '<em><b>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</em>' attribute.
	 * @see #setStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_StateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference()
	 * @model
	 * @generated
	 */
	String getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference <em>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine Props With State Machine Props software amazon awscdk services stepfunctions State Machine Props As Reference</em>' attribute.
	 * @see #getStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference()
	 * @generated
	 */
	void setStateMachinePropsWithStateMachineProps_software_amazon_awscdk_services_stepfunctions_StateMachineProps_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>' attribute.
	 * @see #setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_BucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference()
	 * @model
	 * @generated
	 */
	String getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>' attribute.
	 * @see #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference()
	 * @generated
	 */
	void setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Deploy Cloud Trail java lang Boolean </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deploy Cloud Trail java lang Boolean </em>' attribute.
	 * @see #setDeployCloudTrail_java_lang_Boolean_(Boolean)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_DeployCloudTrail_java_lang_Boolean_()
	 * @model
	 * @generated
	 */
	Boolean getDeployCloudTrail_java_lang_Boolean_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getDeployCloudTrail_java_lang_Boolean_ <em>Deploy Cloud Trail java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deploy Cloud Trail java lang Boolean </em>' attribute.
	 * @see #getDeployCloudTrail_java_lang_Boolean_()
	 * @generated
	 */
	void setDeployCloudTrail_java_lang_Boolean_(Boolean value);

	/**
	 * Returns the value of the '<em><b>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>' attribute.
	 * @see #setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_EventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference()
	 * @model
	 * @generated
	 */
	String getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference <em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Rule Props With Rule Props software amazon awscdk services events Rule Props As Reference</em>' attribute.
	 * @see #getEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference()
	 * @generated
	 */
	void setEventRulePropsWithRuleProps_software_amazon_awscdk_services_events_RuleProps_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>' attribute.
	 * @see #setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_ExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference()
	 * @model
	 * @generated
	 */
	String getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>' attribute.
	 * @see #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference()
	 * @generated
	 */
	void setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.awsconstructs.services.s3stepfunction.S3ToStepFunction"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_GeneratedClassName()
	 * @model default="software.amazon.awscdk.awsconstructs.services.s3stepfunction.S3ToStepFunction" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3ToStepFunctionBuilder_s3stepfunction_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3ToStepFunctionBuilder_s3stepfunction#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // S3ToStepFunctionBuilder_s3stepfunction
