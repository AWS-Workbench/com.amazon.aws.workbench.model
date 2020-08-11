/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.BucketMetricsBuilder_s3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bucket Metrics Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketMetricsBuilder_s3Impl#getId_java_lang_String_ <em>Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketMetricsBuilder_s3Impl#getPrefix_java_lang_String_ <em>Prefix java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketMetricsBuilder_s3Impl#getTagFilters_java_lang_String__java_lang_Object_AsMap <em>Tag Filters java lang String java lang Object As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketMetricsBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketMetricsBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketMetricsBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.BucketMetricsBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BucketMetricsBuilder_s3Impl extends MinimalEObjectImpl.Container implements BucketMetricsBuilder_s3 {
	/**
	 * The default value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_java_lang_String_() <em>Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String id_java_lang_String_ = ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix_java_lang_String_() <em>Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix_java_lang_String_() <em>Prefix java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String prefix_java_lang_String_ = PREFIX_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTagFilters_java_lang_String__java_lang_Object_AsMap() <em>Tag Filters java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTagFilters_java_lang_String__java_lang_Object_AsMap() <em>Tag Filters java lang String java lang Object As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagFilters_java_lang_String__java_lang_Object_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String tagFilters_java_lang_String__java_lang_Object_AsMap = TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.BucketMetrics";

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
	protected BucketMetricsBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.BUCKET_METRICS_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId_java_lang_String_() {
		return id_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId_java_lang_String_(String newId_java_lang_String_) {
		String oldId_java_lang_String_ = id_java_lang_String_;
		id_java_lang_String_ = newId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ID_JAVA_LANG_STRING_, oldId_java_lang_String_,
					id_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix_java_lang_String_() {
		return prefix_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix_java_lang_String_(String newPrefix_java_lang_String_) {
		String oldPrefix_java_lang_String_ = prefix_java_lang_String_;
		prefix_java_lang_String_ = newPrefix_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__PREFIX_JAVA_LANG_STRING_,
					oldPrefix_java_lang_String_, prefix_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTagFilters_java_lang_String__java_lang_Object_AsMap() {
		return tagFilters_java_lang_String__java_lang_Object_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTagFilters_java_lang_String__java_lang_Object_AsMap(
			String newTagFilters_java_lang_String__java_lang_Object_AsMap) {
		String oldTagFilters_java_lang_String__java_lang_Object_AsMap = tagFilters_java_lang_String__java_lang_Object_AsMap;
		tagFilters_java_lang_String__java_lang_Object_AsMap = newTagFilters_java_lang_String__java_lang_Object_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP,
					oldTagFilters_java_lang_String__java_lang_Object_AsMap,
					tagFilters_java_lang_String__java_lang_Object_AsMap));
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
					AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ID_JAVA_LANG_STRING_:
			return getId_java_lang_String_();
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			return getPrefix_java_lang_String_();
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return getTagFilters_java_lang_String__java_lang_Object_AsMap();
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			setPrefix_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setTagFilters_java_lang_String__java_lang_Object_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ID_JAVA_LANG_STRING_:
			setId_java_lang_String_(ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			setPrefix_java_lang_String_(PREFIX_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			setTagFilters_java_lang_String__java_lang_Object_AsMap(
					TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ID_JAVA_LANG_STRING_:
			return ID_JAVA_LANG_STRING__EDEFAULT == null ? id_java_lang_String_ != null
					: !ID_JAVA_LANG_STRING__EDEFAULT.equals(id_java_lang_String_);
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__PREFIX_JAVA_LANG_STRING_:
			return PREFIX_JAVA_LANG_STRING__EDEFAULT == null ? prefix_java_lang_String_ != null
					: !PREFIX_JAVA_LANG_STRING__EDEFAULT.equals(prefix_java_lang_String_);
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP:
			return TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT == null
					? tagFilters_java_lang_String__java_lang_Object_AsMap != null
					: !TAG_FILTERS_JAVA_LANG_STRING_JAVA_LANG_OBJECT_AS_MAP_EDEFAULT
							.equals(tagFilters_java_lang_String__java_lang_Object_AsMap);
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.BUCKET_METRICS_BUILDER_S3__ADDITIONAL_CODE:
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
		result.append(" (id_java_lang_String_: ");
		result.append(id_java_lang_String_);
		result.append(", prefix_java_lang_String_: ");
		result.append(prefix_java_lang_String_);
		result.append(", tagFilters_java_lang_String__java_lang_Object_AsMap: ");
		result.append(tagFilters_java_lang_String__java_lang_Object_AsMap);
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

} //BucketMetricsBuilder_s3Impl
