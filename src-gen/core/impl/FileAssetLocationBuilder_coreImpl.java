/**
 */
package core.impl;

import core.CorePackage;
import core.FileAssetLocationBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Asset Location Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getBucketName_java_lang_String_ <em>Bucket Name java lang String </em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getHttpUrl_java_lang_String_ <em>Http Url java lang String </em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getObjectKey_java_lang_String_ <em>Object Key java lang String </em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getS3ObjectUrl_java_lang_String_ <em>S3 Object Url java lang String </em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getS3Url_java_lang_String_ <em>S3 Url java lang String </em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.FileAssetLocationBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FileAssetLocationBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements FileAssetLocationBuilder_core {
	/**
	 * The default value of the '{@link #getBucketName_java_lang_String_() <em>Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBucketName_java_lang_String_() <em>Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBucketName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String bucketName_java_lang_String_ = BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpUrl_java_lang_String_() <em>Http Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpUrl_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_URL_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpUrl_java_lang_String_() <em>Http Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpUrl_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String httpUrl_java_lang_String_ = HTTP_URL_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectKey_java_lang_String_() <em>Object Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_KEY_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectKey_java_lang_String_() <em>Object Key java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectKey_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String objectKey_java_lang_String_ = OBJECT_KEY_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getS3ObjectUrl_java_lang_String_() <em>S3 Object Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3ObjectUrl_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String S3_OBJECT_URL_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS3ObjectUrl_java_lang_String_() <em>S3 Object Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3ObjectUrl_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String s3ObjectUrl_java_lang_String_ = S3_OBJECT_URL_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getS3Url_java_lang_String_() <em>S3 Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3Url_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String S3_URL_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS3Url_java_lang_String_() <em>S3 Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS3Url_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String s3Url_java_lang_String_ = S3_URL_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.FileAssetLocation";

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
	protected FileAssetLocationBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.FILE_ASSET_LOCATION_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBucketName_java_lang_String_() {
		return bucketName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBucketName_java_lang_String_(String newBucketName_java_lang_String_) {
		String oldBucketName_java_lang_String_ = bucketName_java_lang_String_;
		bucketName_java_lang_String_ = newBucketName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_,
					oldBucketName_java_lang_String_, bucketName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHttpUrl_java_lang_String_() {
		return httpUrl_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHttpUrl_java_lang_String_(String newHttpUrl_java_lang_String_) {
		String oldHttpUrl_java_lang_String_ = httpUrl_java_lang_String_;
		httpUrl_java_lang_String_ = newHttpUrl_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_,
					oldHttpUrl_java_lang_String_, httpUrl_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectKey_java_lang_String_() {
		return objectKey_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectKey_java_lang_String_(String newObjectKey_java_lang_String_) {
		String oldObjectKey_java_lang_String_ = objectKey_java_lang_String_;
		objectKey_java_lang_String_ = newObjectKey_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_,
					oldObjectKey_java_lang_String_, objectKey_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getS3ObjectUrl_java_lang_String_() {
		return s3ObjectUrl_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setS3ObjectUrl_java_lang_String_(String newS3ObjectUrl_java_lang_String_) {
		String oldS3ObjectUrl_java_lang_String_ = s3ObjectUrl_java_lang_String_;
		s3ObjectUrl_java_lang_String_ = newS3ObjectUrl_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_,
					oldS3ObjectUrl_java_lang_String_, s3ObjectUrl_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getS3Url_java_lang_String_() {
		return s3Url_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setS3Url_java_lang_String_(String newS3Url_java_lang_String_) {
		String oldS3Url_java_lang_String_ = s3Url_java_lang_String_;
		s3Url_java_lang_String_ = newS3Url_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_, oldS3Url_java_lang_String_,
					s3Url_java_lang_String_));
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
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_:
			return getBucketName_java_lang_String_();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_:
			return getHttpUrl_java_lang_String_();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_:
			return getObjectKey_java_lang_String_();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_:
			return getS3ObjectUrl_java_lang_String_();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_:
			return getS3Url_java_lang_String_();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_:
			setBucketName_java_lang_String_((String) newValue);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_:
			setHttpUrl_java_lang_String_((String) newValue);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_:
			setObjectKey_java_lang_String_((String) newValue);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_:
			setS3ObjectUrl_java_lang_String_((String) newValue);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_:
			setS3Url_java_lang_String_((String) newValue);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_:
			setBucketName_java_lang_String_(BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_:
			setHttpUrl_java_lang_String_(HTTP_URL_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_:
			setObjectKey_java_lang_String_(OBJECT_KEY_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_:
			setS3ObjectUrl_java_lang_String_(S3_OBJECT_URL_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_:
			setS3Url_java_lang_String_(S3_URL_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__BUCKET_NAME_JAVA_LANG_STRING_:
			return BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT == null ? bucketName_java_lang_String_ != null
					: !BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT.equals(bucketName_java_lang_String_);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__HTTP_URL_JAVA_LANG_STRING_:
			return HTTP_URL_JAVA_LANG_STRING__EDEFAULT == null ? httpUrl_java_lang_String_ != null
					: !HTTP_URL_JAVA_LANG_STRING__EDEFAULT.equals(httpUrl_java_lang_String_);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__OBJECT_KEY_JAVA_LANG_STRING_:
			return OBJECT_KEY_JAVA_LANG_STRING__EDEFAULT == null ? objectKey_java_lang_String_ != null
					: !OBJECT_KEY_JAVA_LANG_STRING__EDEFAULT.equals(objectKey_java_lang_String_);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_OBJECT_URL_JAVA_LANG_STRING_:
			return S3_OBJECT_URL_JAVA_LANG_STRING__EDEFAULT == null ? s3ObjectUrl_java_lang_String_ != null
					: !S3_OBJECT_URL_JAVA_LANG_STRING__EDEFAULT.equals(s3ObjectUrl_java_lang_String_);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__S3_URL_JAVA_LANG_STRING_:
			return S3_URL_JAVA_LANG_STRING__EDEFAULT == null ? s3Url_java_lang_String_ != null
					: !S3_URL_JAVA_LANG_STRING__EDEFAULT.equals(s3Url_java_lang_String_);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.FILE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (bucketName_java_lang_String_: ");
		result.append(bucketName_java_lang_String_);
		result.append(", httpUrl_java_lang_String_: ");
		result.append(httpUrl_java_lang_String_);
		result.append(", objectKey_java_lang_String_: ");
		result.append(objectKey_java_lang_String_);
		result.append(", s3ObjectUrl_java_lang_String_: ");
		result.append(s3ObjectUrl_java_lang_String_);
		result.append(", s3Url_java_lang_String_: ");
		result.append(s3Url_java_lang_String_);
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

} //FileAssetLocationBuilder_coreImpl
