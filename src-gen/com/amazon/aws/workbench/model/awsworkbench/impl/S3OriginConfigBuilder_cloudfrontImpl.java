/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.S3OriginConfigBuilder_cloudfront;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>S3 Origin Config Builder cloudfront</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3OriginConfigBuilder_cloudfrontImpl#getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3OriginConfigBuilder_cloudfrontImpl#getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference <em>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3OriginConfigBuilder_cloudfrontImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3OriginConfigBuilder_cloudfrontImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3OriginConfigBuilder_cloudfrontImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.S3OriginConfigBuilder_cloudfrontImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class S3OriginConfigBuilder_cloudfrontImpl extends ServiceResourcesImpl
		implements S3OriginConfigBuilder_cloudfront {
	/**
	 * The default value of the '{@link #getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>S3 Bucket Source With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference() <em>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference() <em>Origin Access Identity With IOrigin Access Identity software amazon awscdk services cloudfront IOrigin Access Identity As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference = ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.cloudfront.S3OriginConfig";

	/**
	 * The cached value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected String generatedClassName = GENERATED_CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDITIONAL_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalCode() <em>Additional Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalCode()
	 * @generated
	 * @ordered
	 */
	protected String additionalCode = ADDITIONAL_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected S3OriginConfigBuilder_cloudfrontImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() {
		return s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
			String newS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference) {
		String oldS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = newS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE,
					oldS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference,
					s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference() {
		return originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference(
			String newOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference) {
		String oldOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference = originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference;
		originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference = newOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE,
					oldOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference,
					originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGeneratedClassName() {
		return generatedClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdditionalCode() {
		return additionalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalCode(String newAdditionalCode) {
		String oldAdditionalCode = additionalCode;
		additionalCode = newAdditionalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE, oldAdditionalCode,
					additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return getS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE:
			return getOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference();
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			return getAdditionalCode();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE:
			setOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference(
					(String) newValue);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			setAdditionalCode((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setS3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
					S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE:
			setOriginAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference(
					ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			setAdditionalCode(ADDITIONAL_CODE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT == null
					? s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference != null
					: !S3_BUCKET_SOURCE_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT
							.equals(s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE:
			return ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE_EDEFAULT == null
					? originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference != null
					: !ORIGIN_ACCESS_IDENTITY_WITH_IORIGIN_ACCESS_IDENTITY_SOFTWARE_AMAZON_AWSCDK_SERVICES_CLOUDFRONT_IORIGIN_ACCESS_IDENTITY_AS_REFERENCE_EDEFAULT
							.equals(originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference);
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.S3_ORIGIN_CONFIG_BUILDER_CLOUDFRONT__ADDITIONAL_CODE:
			return ADDITIONAL_CODE_EDEFAULT == null ? additionalCode != null
					: !ADDITIONAL_CODE_EDEFAULT.equals(additionalCode);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference: ");
		result.append(s3BucketSourceWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
		result.append(
				", originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference: ");
		result.append(
				originAccessIdentityWithIOriginAccessIdentity_software_amazon_awscdk_services_cloudfront_IOriginAccessIdentity_AsReference);
		result.append(", generatedClassName: ");
		result.append(generatedClassName);
		result.append(", varName: ");
		result.append(varName);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", additionalCode: ");
		result.append(additionalCode);
		result.append(')');
		return result.toString();
	}

} //S3OriginConfigBuilder_cloudfrontImpl
