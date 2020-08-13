/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.CloudFrontToS3Builder_cloudfronts3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Front To S3 Builder cloudfronts3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getCloudFrontDistributionProps_java_lang_Object_ <em>Cloud Front Distribution Props java lang Object </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getInsertHttpSecurityHeaders_java_lang_Boolean_ <em>Insert Http Security Headers java lang Boolean </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.CloudFrontToS3Builder_cloudfronts3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudFrontToS3Builder_cloudfronts3Impl extends ServiceResourcesImpl
		implements CloudFrontToS3Builder_cloudfronts3 {
	/**
	 * The default value of the '{@link #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() <em>Bucket Props With Bucket Props software amazon awscdk services s3 Bucket Props As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference = BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudFrontDistributionProps_java_lang_Object_() <em>Cloud Front Distribution Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudFrontDistributionProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected static final Object CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudFrontDistributionProps_java_lang_Object_() <em>Cloud Front Distribution Props java lang Object </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudFrontDistributionProps_java_lang_Object_()
	 * @generated
	 * @ordered
	 */
	protected Object cloudFrontDistributionProps_java_lang_Object_ = CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT;

	/**
	 * The default value of the '{@link #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() <em>Existing Bucket Obj With Bucket software amazon awscdk services s3 Bucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference = EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertHttpSecurityHeaders_java_lang_Boolean_() <em>Insert Http Security Headers java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertHttpSecurityHeaders_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertHttpSecurityHeaders_java_lang_Boolean_() <em>Insert Http Security Headers java lang Boolean </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertHttpSecurityHeaders_java_lang_Boolean_()
	 * @generated
	 * @ordered
	 */
	protected Boolean insertHttpSecurityHeaders_java_lang_Boolean_ = INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.awsconstructs.services.cloudfronts3.CloudFrontToS3";

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
	protected CloudFrontToS3Builder_cloudfronts3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference() {
		return bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(
			String newBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference) {
		String oldBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference = bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference;
		bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference = newBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE,
					oldBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference,
					bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCloudFrontDistributionProps_java_lang_Object_() {
		return cloudFrontDistributionProps_java_lang_Object_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudFrontDistributionProps_java_lang_Object_(
			Object newCloudFrontDistributionProps_java_lang_Object_) {
		Object oldCloudFrontDistributionProps_java_lang_Object_ = cloudFrontDistributionProps_java_lang_Object_;
		cloudFrontDistributionProps_java_lang_Object_ = newCloudFrontDistributionProps_java_lang_Object_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_,
					oldCloudFrontDistributionProps_java_lang_Object_, cloudFrontDistributionProps_java_lang_Object_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference() {
		return existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(
			String newExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference) {
		String oldExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference = existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference;
		existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference = newExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE,
					oldExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference,
					existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getInsertHttpSecurityHeaders_java_lang_Boolean_() {
		return insertHttpSecurityHeaders_java_lang_Boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInsertHttpSecurityHeaders_java_lang_Boolean_(
			Boolean newInsertHttpSecurityHeaders_java_lang_Boolean_) {
		Boolean oldInsertHttpSecurityHeaders_java_lang_Boolean_ = insertHttpSecurityHeaders_java_lang_Boolean_;
		insertHttpSecurityHeaders_java_lang_Boolean_ = newInsertHttpSecurityHeaders_java_lang_Boolean_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_,
					oldInsertHttpSecurityHeaders_java_lang_Boolean_, insertHttpSecurityHeaders_java_lang_Boolean_));
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
					AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			return getBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_:
			return getCloudFrontDistributionProps_java_lang_Object_();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			return getExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_:
			return getInsertHttpSecurityHeaders_java_lang_Boolean_();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_:
			setCloudFrontDistributionProps_java_lang_Object_(newValue);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_:
			setInsertHttpSecurityHeaders_java_lang_Boolean_((Boolean) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			setBucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference(
					BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_:
			setCloudFrontDistributionProps_java_lang_Object_(CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			setExistingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference(
					EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_:
			setInsertHttpSecurityHeaders_java_lang_Boolean_(INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN__EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE:
			return BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT == null
					? bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference != null
					: !BUCKET_PROPS_WITH_BUCKET_PROPS_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_PROPS_AS_REFERENCE_EDEFAULT
							.equals(bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference);
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT_:
			return CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT == null
					? cloudFrontDistributionProps_java_lang_Object_ != null
					: !CLOUD_FRONT_DISTRIBUTION_PROPS_JAVA_LANG_OBJECT__EDEFAULT
							.equals(cloudFrontDistributionProps_java_lang_Object_);
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE:
			return EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT == null
					? existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference != null
					: !EXISTING_BUCKET_OBJ_WITH_BUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_BUCKET_AS_REFERENCE_EDEFAULT
							.equals(existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference);
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN_:
			return INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN__EDEFAULT == null
					? insertHttpSecurityHeaders_java_lang_Boolean_ != null
					: !INSERT_HTTP_SECURITY_HEADERS_JAVA_LANG_BOOLEAN__EDEFAULT
							.equals(insertHttpSecurityHeaders_java_lang_Boolean_);
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.CLOUD_FRONT_TO_S3_BUILDER_CLOUDFRONTS3__ADDITIONAL_CODE:
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
		result.append(" (bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference: ");
		result.append(bucketPropsWithBucketProps_software_amazon_awscdk_services_s3_BucketProps_AsReference);
		result.append(", cloudFrontDistributionProps_java_lang_Object_: ");
		result.append(cloudFrontDistributionProps_java_lang_Object_);
		result.append(", existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference: ");
		result.append(existingBucketObjWithBucket_software_amazon_awscdk_services_s3_Bucket_AsReference);
		result.append(", insertHttpSecurityHeaders_java_lang_Boolean_: ");
		result.append(insertHttpSecurityHeaders_java_lang_Boolean_);
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

} //CloudFrontToS3Builder_cloudfronts3Impl
