/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Kinesis Analytics App Props Builder core</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference <em>Kinesis Firehose With Cfn Delivery Stream software amazon awscdk services kinesisfirehose Cfn Delivery Stream As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getKinesisAnalyticsProps_java_lang_Object_ <em>Kinesis Analytics Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBuildKinesisAnalyticsAppPropsBuilder_core()
 * @model
 * @generated
 */
public interface BuildKinesisAnalyticsAppPropsBuilder_core extends EObject {
	/**
	 * Returns the value of the '<em><b>Kinesis Firehose With Cfn Delivery Stream software amazon awscdk services kinesisfirehose Cfn Delivery Stream As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinesis Firehose With Cfn Delivery Stream software amazon awscdk services kinesisfirehose Cfn Delivery Stream As Reference</em>' attribute.
	 * @see #setKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBuildKinesisAnalyticsAppPropsBuilder_core_KinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference()
	 * @model
	 * @generated
	 */
	String getKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference <em>Kinesis Firehose With Cfn Delivery Stream software amazon awscdk services kinesisfirehose Cfn Delivery Stream As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinesis Firehose With Cfn Delivery Stream software amazon awscdk services kinesisfirehose Cfn Delivery Stream As Reference</em>' attribute.
	 * @see #getKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference()
	 * @generated
	 */
	void setKinesisFirehoseWithCfnDeliveryStream_software_amazon_awscdk_services_kinesisfirehose_CfnDeliveryStream_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Kinesis Analytics Props java lang Object </b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kinesis Analytics Props java lang Object </em>' attribute.
	 * @see #setKinesisAnalyticsProps_java_lang_Object_(Object)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBuildKinesisAnalyticsAppPropsBuilder_core_KinesisAnalyticsProps_java_lang_Object_()
	 * @model
	 * @generated
	 */
	Object getKinesisAnalyticsProps_java_lang_Object_();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getKinesisAnalyticsProps_java_lang_Object_ <em>Kinesis Analytics Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kinesis Analytics Props java lang Object </em>' attribute.
	 * @see #getKinesisAnalyticsProps_java_lang_Object_()
	 * @generated
	 */
	void setKinesisAnalyticsProps_java_lang_Object_(Object value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.awsconstructs.services.core.BuildKinesisAnalyticsAppProps"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBuildKinesisAnalyticsAppPropsBuilder_core_GeneratedClassName()
	 * @model default="software.amazon.awscdk.awsconstructs.services.core.BuildKinesisAnalyticsAppProps" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBuildKinesisAnalyticsAppPropsBuilder_core_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBuildKinesisAnalyticsAppPropsBuilder_core_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getBuildKinesisAnalyticsAppPropsBuilder_core_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.BuildKinesisAnalyticsAppPropsBuilder_core#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // BuildKinesisAnalyticsAppPropsBuilder_core
