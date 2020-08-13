/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AssetImageBuilder_ecs;
import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.FollowMode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asset Image Builder ecs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getExclude_java_lang_String_AsList <em>Exclude java lang String As List</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getFollow_software_amazon_awscdk_assets_FollowMode_ <em>Follow software amazon awscdk assets Follow Mode </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getExtraHash_java_lang_String_ <em>Extra Hash java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getBuildArgs_java_lang_String__java_lang_String_AsMap <em>Build Args java lang String java lang String As Map</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getFile_java_lang_String_ <em>File java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getTarget_java_lang_String_ <em>Target java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.AssetImageBuilder_ecsImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssetImageBuilder_ecsImpl extends ServiceResourcesImpl implements AssetImageBuilder_ecs {
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
	 * The default value of the '{@link #getFollow_software_amazon_awscdk_assets_FollowMode_() <em>Follow software amazon awscdk assets Follow Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollow_software_amazon_awscdk_assets_FollowMode_()
	 * @generated
	 * @ordered
	 */
	protected static final FollowMode FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE__EDEFAULT = FollowMode.NEVER;

	/**
	 * The cached value of the '{@link #getFollow_software_amazon_awscdk_assets_FollowMode_() <em>Follow software amazon awscdk assets Follow Mode </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFollow_software_amazon_awscdk_assets_FollowMode_()
	 * @generated
	 * @ordered
	 */
	protected FollowMode follow_software_amazon_awscdk_assets_FollowMode_ = FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE__EDEFAULT;

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
	 * The default value of the '{@link #getBuildArgs_java_lang_String__java_lang_String_AsMap() <em>Build Args java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBuildArgs_java_lang_String__java_lang_String_AsMap() <em>Build Args java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String buildArgs_java_lang_String__java_lang_String_AsMap = BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getFile_java_lang_String_() <em>File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile_java_lang_String_() <em>File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFile_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String file_java_lang_String_ = FILE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getRepositoryName_java_lang_String_() <em>Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepositoryName_java_lang_String_() <em>Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepositoryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String repositoryName_java_lang_String_ = REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget_java_lang_String_() <em>Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget_java_lang_String_() <em>Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String target_java_lang_String_ = TARGET_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.ecs.AssetImage";

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
	protected AssetImageBuilder_ecsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.ASSET_IMAGE_BUILDER_ECS;
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
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXCLUDE_JAVA_LANG_STRING_AS_LIST,
					oldExclude_java_lang_String_AsList, exclude_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FollowMode getFollow_software_amazon_awscdk_assets_FollowMode_() {
		return follow_software_amazon_awscdk_assets_FollowMode_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFollow_software_amazon_awscdk_assets_FollowMode_(
			FollowMode newFollow_software_amazon_awscdk_assets_FollowMode_) {
		FollowMode oldFollow_software_amazon_awscdk_assets_FollowMode_ = follow_software_amazon_awscdk_assets_FollowMode_;
		follow_software_amazon_awscdk_assets_FollowMode_ = newFollow_software_amazon_awscdk_assets_FollowMode_ == null
				? FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE__EDEFAULT
				: newFollow_software_amazon_awscdk_assets_FollowMode_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_,
					oldFollow_software_amazon_awscdk_assets_FollowMode_,
					follow_software_amazon_awscdk_assets_FollowMode_));
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
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXTRA_HASH_JAVA_LANG_STRING_,
					oldExtraHash_java_lang_String_, extraHash_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBuildArgs_java_lang_String__java_lang_String_AsMap() {
		return buildArgs_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBuildArgs_java_lang_String__java_lang_String_AsMap(
			String newBuildArgs_java_lang_String__java_lang_String_AsMap) {
		String oldBuildArgs_java_lang_String__java_lang_String_AsMap = buildArgs_java_lang_String__java_lang_String_AsMap;
		buildArgs_java_lang_String__java_lang_String_AsMap = newBuildArgs_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldBuildArgs_java_lang_String__java_lang_String_AsMap,
					buildArgs_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFile_java_lang_String_() {
		return file_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFile_java_lang_String_(String newFile_java_lang_String_) {
		String oldFile_java_lang_String_ = file_java_lang_String_;
		file_java_lang_String_ = newFile_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FILE_JAVA_LANG_STRING_, oldFile_java_lang_String_,
					file_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRepositoryName_java_lang_String_() {
		return repositoryName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRepositoryName_java_lang_String_(String newRepositoryName_java_lang_String_) {
		String oldRepositoryName_java_lang_String_ = repositoryName_java_lang_String_;
		repositoryName_java_lang_String_ = newRepositoryName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__REPOSITORY_NAME_JAVA_LANG_STRING_,
					oldRepositoryName_java_lang_String_, repositoryName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTarget_java_lang_String_() {
		return target_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget_java_lang_String_(String newTarget_java_lang_String_) {
		String oldTarget_java_lang_String_ = target_java_lang_String_;
		target_java_lang_String_ = newTarget_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__TARGET_JAVA_LANG_STRING_, oldTarget_java_lang_String_,
					target_java_lang_String_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__VAR_NAME,
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
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__ADDITIONAL_CODE, oldAdditionalCode, additionalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			return getExclude_java_lang_String_AsList();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_:
			return getFollow_software_amazon_awscdk_assets_FollowMode_();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXTRA_HASH_JAVA_LANG_STRING_:
			return getExtraHash_java_lang_String_();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getBuildArgs_java_lang_String__java_lang_String_AsMap();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FILE_JAVA_LANG_STRING_:
			return getFile_java_lang_String_();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__REPOSITORY_NAME_JAVA_LANG_STRING_:
			return getRepositoryName_java_lang_String_();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__TARGET_JAVA_LANG_STRING_:
			return getTarget_java_lang_String_();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			setExclude_java_lang_String_AsList((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_:
			setFollow_software_amazon_awscdk_assets_FollowMode_((FollowMode) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXTRA_HASH_JAVA_LANG_STRING_:
			setExtraHash_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setBuildArgs_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FILE_JAVA_LANG_STRING_:
			setFile_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__REPOSITORY_NAME_JAVA_LANG_STRING_:
			setRepositoryName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__TARGET_JAVA_LANG_STRING_:
			setTarget_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			setExclude_java_lang_String_AsList(EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_:
			setFollow_software_amazon_awscdk_assets_FollowMode_(
					FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE__EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXTRA_HASH_JAVA_LANG_STRING_:
			setExtraHash_java_lang_String_(EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setBuildArgs_java_lang_String__java_lang_String_AsMap(
					BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FILE_JAVA_LANG_STRING_:
			setFile_java_lang_String_(FILE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__REPOSITORY_NAME_JAVA_LANG_STRING_:
			setRepositoryName_java_lang_String_(REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__TARGET_JAVA_LANG_STRING_:
			setTarget_java_lang_String_(TARGET_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXCLUDE_JAVA_LANG_STRING_AS_LIST:
			return EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? exclude_java_lang_String_AsList != null
					: !EXCLUDE_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(exclude_java_lang_String_AsList);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE_:
			return follow_software_amazon_awscdk_assets_FollowMode_ != FOLLOW_SOFTWARE_AMAZON_AWSCDK_ASSETS_FOLLOW_MODE__EDEFAULT;
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__EXTRA_HASH_JAVA_LANG_STRING_:
			return EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT == null ? extraHash_java_lang_String_ != null
					: !EXTRA_HASH_JAVA_LANG_STRING__EDEFAULT.equals(extraHash_java_lang_String_);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? buildArgs_java_lang_String__java_lang_String_AsMap != null
					: !BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(buildArgs_java_lang_String__java_lang_String_AsMap);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__FILE_JAVA_LANG_STRING_:
			return FILE_JAVA_LANG_STRING__EDEFAULT == null ? file_java_lang_String_ != null
					: !FILE_JAVA_LANG_STRING__EDEFAULT.equals(file_java_lang_String_);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__REPOSITORY_NAME_JAVA_LANG_STRING_:
			return REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? repositoryName_java_lang_String_ != null
					: !REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(repositoryName_java_lang_String_);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__TARGET_JAVA_LANG_STRING_:
			return TARGET_JAVA_LANG_STRING__EDEFAULT == null ? target_java_lang_String_ != null
					: !TARGET_JAVA_LANG_STRING__EDEFAULT.equals(target_java_lang_String_);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.ASSET_IMAGE_BUILDER_ECS__ADDITIONAL_CODE:
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
		result.append(", follow_software_amazon_awscdk_assets_FollowMode_: ");
		result.append(follow_software_amazon_awscdk_assets_FollowMode_);
		result.append(", extraHash_java_lang_String_: ");
		result.append(extraHash_java_lang_String_);
		result.append(", buildArgs_java_lang_String__java_lang_String_AsMap: ");
		result.append(buildArgs_java_lang_String__java_lang_String_AsMap);
		result.append(", file_java_lang_String_: ");
		result.append(file_java_lang_String_);
		result.append(", repositoryName_java_lang_String_: ");
		result.append(repositoryName_java_lang_String_);
		result.append(", target_java_lang_String_: ");
		result.append(target_java_lang_String_);
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

} //AssetImageBuilder_ecsImpl
