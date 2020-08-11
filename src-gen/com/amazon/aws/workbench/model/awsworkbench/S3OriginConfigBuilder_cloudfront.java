/**
 */
package com.amazon.aws.workbench.model.awsworkbench;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S3 Origin Config Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference <em>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3OriginConfigBuilder_cloudfront()
 * @model
 * @generated
 */
public interface S3OriginConfigBuilder_cloudfront extends EObject {
	/**
	 * Returns the value of the '<em><b>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #setS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3OriginConfigBuilder_cloudfront_S3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @model
	 * @generated
	 */
	String getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</em>' attribute.
	 * @see #getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 */
	void setS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(String value);

	/**
	 * Returns the value of the '<em><b>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</em>' attribute.
	 * @see #setOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3OriginConfigBuilder_cloudfront_OriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference()
	 * @model
	 * @generated
	 */
	String getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference <em>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</em>' attribute.
	 * @see #getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference()
	 * @generated
	 */
	void setOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference(
			String value);

	/**
	 * Returns the value of the '<em><b>Generated Class Name</b></em>' attribute.
	 * The default value is <code>"software.amazon.awscdk.services.cloudfront.S3OriginConfig"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generated Class Name</em>' attribute.
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3OriginConfigBuilder_cloudfront_GeneratedClassName()
	 * @model default="software.amazon.awscdk.services.cloudfront.S3OriginConfig" changeable="false"
	 * @generated
	 */
	String getGeneratedClassName();

	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3OriginConfigBuilder_cloudfront_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getVarName <em>Var Name</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3OriginConfigBuilder_cloudfront_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getIdentifier <em>Identifier</em>}' attribute.
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
	 * @see com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage#getS3OriginConfigBuilder_cloudfront_AdditionalCode()
	 * @model
	 * @generated
	 */
	String getAdditionalCode();

	/**
	 * Sets the value of the '{@link com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront#getAdditionalCode <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Code</em>' attribute.
	 * @see #getAdditionalCode()
	 * @generated
	 */
	void setAdditionalCode(String value);

} // S3OriginConfigBuilder_cloudfront
