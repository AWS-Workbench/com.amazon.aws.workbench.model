/**
 */
package ec2.impl;

import ec2.Ec2Package;
import ec2.S3DownloadOptionsBuilder_ec2;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>S3 Download Options Builder ec2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl#getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}</li>
 *   <li>{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl#getBucketKey_java_lang_String_ <em>Bucket Key java lang String </em>}</li>
 *   <li>{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl#getLocalFile_java_lang_String_ <em>Local File java lang String </em>}</li>
 *   <li>{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link ec2.impl.S3DownloadOptionsBuilder_ec2Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class S3DownloadOptionsBuilder_ec2Impl extends MinimalEObjectImpl.Container
		implements S3DownloadOptionsBuilder_ec2 {
	/**
	 * The default value of the '{@link #getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() <em>Bucket With IBucket software amazon awscdk services s3 IBucket As Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference()
	 * @generated
	 * @ordered
	 */
	protected String bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBucketKey_java_lang_String_() <em>Bucket Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_KEY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketKey_java_lang_String_() <em>Bucket Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String bucketKey_java_lang_String_ = BUCKET_KEY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalFile_java_lang_String_() <em>Local File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFile_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_FILE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalFile_java_lang_String_() <em>Local File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalFile_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String localFile_java_lang_String_ = LOCAL_FILE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ec2.S3DownloadOptions";

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
	protected S3DownloadOptionsBuilder_ec2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.Literals.S3_DOWNLOAD_OPTIONS_BUILDER_EC2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference() {
		return bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
			String newBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference) {
		String oldBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference = newBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE,
					oldBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference,
					bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketKey_java_lang_String_() {
		return bucketKey_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketKey_java_lang_String_(String newBucketKey_java_lang_String_) {
		String oldBucketKey_java_lang_String_ = bucketKey_java_lang_String_;
		bucketKey_java_lang_String_ = newBucketKey_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_,
					oldBucketKey_java_lang_String_, bucketKey_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLocalFile_java_lang_String_() {
		return localFile_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocalFile_java_lang_String_(String newLocalFile_java_lang_String_) {
		String oldLocalFile_java_lang_String_ = localFile_java_lang_String_;
		localFile_java_lang_String_ = newLocalFile_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_,
					oldLocalFile_java_lang_String_, localFile_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME,
					oldVarName, varName));
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
					Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER, oldIdentifier, identifier));
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
					Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return getBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference();
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_:
			return getBucketKey_java_lang_String_();
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_:
			return getLocalFile_java_lang_String_();
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME:
			return getVarName();
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return getIdentifier();
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference((String) newValue);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_:
			setBucketKey_java_lang_String_((String) newValue);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_:
			setLocalFile_java_lang_String_((String) newValue);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName((String) newValue);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			setBucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference(
					BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_:
			setBucketKey_java_lang_String_(BUCKET_KEY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_:
			setLocalFile_java_lang_String_(LOCAL_FILE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE:
			return BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT == null
					? bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference != null
					: !BUCKET_WITH_IBUCKET_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_IBUCKET_AS_REFERENCE_EDEFAULT
							.equals(bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__BUCKET_KEY_JAVA_LANG_STRING_:
			return BUCKET_KEY_JAVA_LANG_STRING__EDEFAULT == null ? bucketKey_java_lang_String_ != null
					: !BUCKET_KEY_JAVA_LANG_STRING__EDEFAULT.equals(bucketKey_java_lang_String_);
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__LOCAL_FILE_JAVA_LANG_STRING_:
			return LOCAL_FILE_JAVA_LANG_STRING__EDEFAULT == null ? localFile_java_lang_String_ != null
					: !LOCAL_FILE_JAVA_LANG_STRING__EDEFAULT.equals(localFile_java_lang_String_);
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case Ec2Package.S3_DOWNLOAD_OPTIONS_BUILDER_EC2__ADDITIONAL_CODE:
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
		result.append(" (bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference: ");
		result.append(bucketWithIBucket_software_amazon_awscdk_services_s3_IBucket_AsReference);
		result.append(", bucketKey_java_lang_String_: ");
		result.append(bucketKey_java_lang_String_);
		result.append(", localFile_java_lang_String_: ");
		result.append(localFile_java_lang_String_);
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

} //S3DownloadOptionsBuilder_ec2Impl
