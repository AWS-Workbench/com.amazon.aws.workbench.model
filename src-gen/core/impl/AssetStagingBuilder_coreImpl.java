/**
 */
package core.impl;

import core.AssetStagingBuilder_core;
import core.CorePackage;
import core.SymlinkFollowMode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Staging Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}</li>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getFollow_software_amazon_awscdk_core_SymlinkFollowMode_ <em>Follow software amazon awscdk core Symlink Follow Mode </em>}</li>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getExtraHash_java_lang_String_ <em>Extra Hash java lang String </em>}</li>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getSourcePath_java_lang_String_ <em>Source Path java lang String </em>}</li>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.AssetStagingBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetStagingBuilder_coreImpl extends MinimalEObjectImpl.Container implements AssetStagingBuilder_core {
	/**
	 * The default value of the '{@link #getExclude_java_lang_String_AsList() <em>Exclude java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclude_java_lang_String_AsList() <em>Exclude java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String exclude_java_lang_String_AsList = EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getFollow_software_amazon_awscdk_core_SymlinkFollowMode_() <em>Follow software amazon awscdk core Symlink Follow Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @generated
	 * @ordered
	 */
	protected static final SymlinkFollowMode FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE__EDEFAULT = SymlinkFollowMode.NEVER;

	/**
	 * The cached value of the '{@link #getFollow_software_amazon_awscdk_core_SymlinkFollowMode_() <em>Follow software amazon awscdk core Symlink Follow Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollow_software_amazon_awscdk_core_SymlinkFollowMode_()
	 * @generated
	 * @ordered
	 */
	protected SymlinkFollowMode follow_software_amazon_awscdk_core_SymlinkFollowMode_ = FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE__EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraHash_java_lang_String_() <em>Extra Hash java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraHash_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtraHash_java_lang_String_() <em>Extra Hash java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraHash_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String extraHash_java_lang_String_ = EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSourcePath_java_lang_String_() <em>Source Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_PATH_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourcePath_java_lang_String_() <em>Source Path java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePath_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String sourcePath_java_lang_String_ = SOURCE_PATH_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.AssetStaging";

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
	protected AssetStagingBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ASSET_STAGING_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExclude_java_lang_String_AsList() {
		return exclude_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclude_java_lang_String_AsList(String newExclude_java_lang_String_AsList) {
		String oldExclude_java_lang_String_AsList = exclude_java_lang_String_AsList;
		exclude_java_lang_String_AsList = newExclude_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST,
					oldExclude_java_lang_String_AsList, exclude_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SymlinkFollowMode getFollow_software_amazon_awscdk_core_SymlinkFollowMode_() {
		return follow_software_amazon_awscdk_core_SymlinkFollowMode_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollow_software_amazon_awscdk_core_SymlinkFollowMode_(
			SymlinkFollowMode newFollow_software_amazon_awscdk_core_SymlinkFollowMode_) {
		SymlinkFollowMode oldFollow_software_amazon_awscdk_core_SymlinkFollowMode_ = follow_software_amazon_awscdk_core_SymlinkFollowMode_;
		follow_software_amazon_awscdk_core_SymlinkFollowMode_ = newFollow_software_amazon_awscdk_core_SymlinkFollowMode_ == null
				? FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE__EDEFAULT
				: newFollow_software_amazon_awscdk_core_SymlinkFollowMode_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_,
					oldFollow_software_amazon_awscdk_core_SymlinkFollowMode_,
					follow_software_amazon_awscdk_core_SymlinkFollowMode_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtraHash_java_lang_String_() {
		return extraHash_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraHash_java_lang_String_(String newExtraHash_java_lang_String_) {
		String oldExtraHash_java_lang_String_ = extraHash_java_lang_String_;
		extraHash_java_lang_String_ = newExtraHash_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_,
					oldExtraHash_java_lang_String_, extraHash_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourcePath_java_lang_String_() {
		return sourcePath_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourcePath_java_lang_String_(String newSourcePath_java_lang_String_) {
		String oldSourcePath_java_lang_String_ = sourcePath_java_lang_String_;
		sourcePath_java_lang_String_ = newSourcePath_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_,
					oldSourcePath_java_lang_String_, sourcePath_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASSET_STAGING_BUILDER_CORE__VAR_NAME,
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ASSET_STAGING_BUILDER_CORE__IDENTIFIER,
					oldIdentifier, identifier));
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
					CorePackage.ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			return getExclude_java_lang_String_AsList();
		case CorePackage.ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_:
			return getFollow_software_amazon_awscdk_core_SymlinkFollowMode_();
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_:
			return getExtraHash_java_lang_String_();
		case CorePackage.ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_:
			return getSourcePath_java_lang_String_();
		case CorePackage.ASSET_STAGING_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.ASSET_STAGING_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.ASSET_STAGING_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			setExclude_java_lang_String_AsList((String) newValue);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_:
			setFollow_software_amazon_awscdk_core_SymlinkFollowMode_((SymlinkFollowMode) newValue);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_:
			setExtraHash_java_lang_String_((String) newValue);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_:
			setSourcePath_java_lang_String_((String) newValue);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			setExclude_java_lang_String_AsList(EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_:
			setFollow_software_amazon_awscdk_core_SymlinkFollowMode_(
					FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE__EDEFAULT);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_:
			setExtraHash_java_lang_String_(EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_:
			setSourcePath_java_lang_String_(SOURCE_PATH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			return EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? exclude_java_lang_String_AsList != null
					: !EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(exclude_java_lang_String_AsList);
		case CorePackage.ASSET_STAGING_BUILDER_CORE__FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE_:
			return follow_software_amazon_awscdk_core_SymlinkFollowMode_ != FOLLOW_SOFTWARE_AMAZON_AWSCDK_CORE_SYMLINK_FOLLOW_MODE__EDEFAULT;
		case CorePackage.ASSET_STAGING_BUILDER_CORE__EXTRA_HASH_JAVA_LANG_STRING_:
			return EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT == null ? extraHash_java_lang_String_ != null
					: !EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT.equals(extraHash_java_lang_String_);
		case CorePackage.ASSET_STAGING_BUILDER_CORE__SOURCE_PATH_JAVA_LANG_STRING_:
			return SOURCE_PATH_JAVA_LANG_STRING__EDEFAULT == null ? sourcePath_java_lang_String_ != null
					: !SOURCE_PATH_JAVA_LANG_STRING__EDEFAULT.equals(sourcePath_java_lang_String_);
		case CorePackage.ASSET_STAGING_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.ASSET_STAGING_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.ASSET_STAGING_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.ASSET_STAGING_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (exclude_java_lang_String_AsList: ");
		result.append(exclude_java_lang_String_AsList);
		result.append(", follow_software_amazon_awscdk_core_SymlinkFollowMode_: ");
		result.append(follow_software_amazon_awscdk_core_SymlinkFollowMode_);
		result.append(", extraHash_java_lang_String_: ");
		result.append(extraHash_java_lang_String_);
		result.append(", sourcePath_java_lang_String_: ");
		result.append(sourcePath_java_lang_String_);
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

} //AssetStagingBuilder_coreImpl
