/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.DefaultStackSynthesizerBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Stack Synthesizer Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getAssetPublishingExternalId_java_lang_String_ <em>Asset Publishing External Id java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getAssetPublishingRoleArn_java_lang_String_ <em>Asset Publishing Role Arn java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getCloudFormationExecutionRole_java_lang_String_ <em>Cloud Formation Execution Role java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getDeployRoleArn_java_lang_String_ <em>Deploy Role Arn java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getFileAssetsBucketName_java_lang_String_ <em>File Assets Bucket Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getImageAssetsRepositoryName_java_lang_String_ <em>Image Assets Repository Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getQualifier_java_lang_String_ <em>Qualifier java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.DefaultStackSynthesizerBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultStackSynthesizerBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements DefaultStackSynthesizerBuilder_core {
	/**
	 * The default value of the '{@link #getAssetPublishingExternalId_java_lang_String_() <em>Asset Publishing External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPublishingExternalId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetPublishingExternalId_java_lang_String_() <em>Asset Publishing External Id java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPublishingExternalId_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String assetPublishingExternalId_java_lang_String_ = ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getAssetPublishingRoleArn_java_lang_String_() <em>Asset Publishing Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPublishingRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssetPublishingRoleArn_java_lang_String_() <em>Asset Publishing Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssetPublishingRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String assetPublishingRoleArn_java_lang_String_ = ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getCloudFormationExecutionRole_java_lang_String_() <em>Cloud Formation Execution Role java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudFormationExecutionRole_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCloudFormationExecutionRole_java_lang_String_() <em>Cloud Formation Execution Role java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCloudFormationExecutionRole_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String cloudFormationExecutionRole_java_lang_String_ = CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDeployRoleArn_java_lang_String_() <em>Deploy Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeployRoleArn_java_lang_String_() <em>Deploy Role Arn java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployRoleArn_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String deployRoleArn_java_lang_String_ = DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getFileAssetsBucketName_java_lang_String_() <em>File Assets Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileAssetsBucketName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileAssetsBucketName_java_lang_String_() <em>File Assets Bucket Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileAssetsBucketName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String fileAssetsBucketName_java_lang_String_ = FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getImageAssetsRepositoryName_java_lang_String_() <em>Image Assets Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAssetsRepositoryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageAssetsRepositoryName_java_lang_String_() <em>Image Assets Repository Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAssetsRepositoryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String imageAssetsRepositoryName_java_lang_String_ = IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getQualifier_java_lang_String_() <em>Qualifier java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIER_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifier_java_lang_String_() <em>Qualifier java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifier_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String qualifier_java_lang_String_ = QUALIFIER_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.DefaultStackSynthesizer";

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
	protected DefaultStackSynthesizerBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetPublishingExternalId_java_lang_String_() {
		return assetPublishingExternalId_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetPublishingExternalId_java_lang_String_(String newAssetPublishingExternalId_java_lang_String_) {
		String oldAssetPublishingExternalId_java_lang_String_ = assetPublishingExternalId_java_lang_String_;
		assetPublishingExternalId_java_lang_String_ = newAssetPublishingExternalId_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_,
					oldAssetPublishingExternalId_java_lang_String_, assetPublishingExternalId_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssetPublishingRoleArn_java_lang_String_() {
		return assetPublishingRoleArn_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssetPublishingRoleArn_java_lang_String_(String newAssetPublishingRoleArn_java_lang_String_) {
		String oldAssetPublishingRoleArn_java_lang_String_ = assetPublishingRoleArn_java_lang_String_;
		assetPublishingRoleArn_java_lang_String_ = newAssetPublishingRoleArn_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_,
					oldAssetPublishingRoleArn_java_lang_String_, assetPublishingRoleArn_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCloudFormationExecutionRole_java_lang_String_() {
		return cloudFormationExecutionRole_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCloudFormationExecutionRole_java_lang_String_(
			String newCloudFormationExecutionRole_java_lang_String_) {
		String oldCloudFormationExecutionRole_java_lang_String_ = cloudFormationExecutionRole_java_lang_String_;
		cloudFormationExecutionRole_java_lang_String_ = newCloudFormationExecutionRole_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_,
					oldCloudFormationExecutionRole_java_lang_String_, cloudFormationExecutionRole_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeployRoleArn_java_lang_String_() {
		return deployRoleArn_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeployRoleArn_java_lang_String_(String newDeployRoleArn_java_lang_String_) {
		String oldDeployRoleArn_java_lang_String_ = deployRoleArn_java_lang_String_;
		deployRoleArn_java_lang_String_ = newDeployRoleArn_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_,
					oldDeployRoleArn_java_lang_String_, deployRoleArn_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFileAssetsBucketName_java_lang_String_() {
		return fileAssetsBucketName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFileAssetsBucketName_java_lang_String_(String newFileAssetsBucketName_java_lang_String_) {
		String oldFileAssetsBucketName_java_lang_String_ = fileAssetsBucketName_java_lang_String_;
		fileAssetsBucketName_java_lang_String_ = newFileAssetsBucketName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_,
					oldFileAssetsBucketName_java_lang_String_, fileAssetsBucketName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageAssetsRepositoryName_java_lang_String_() {
		return imageAssetsRepositoryName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageAssetsRepositoryName_java_lang_String_(String newImageAssetsRepositoryName_java_lang_String_) {
		String oldImageAssetsRepositoryName_java_lang_String_ = imageAssetsRepositoryName_java_lang_String_;
		imageAssetsRepositoryName_java_lang_String_ = newImageAssetsRepositoryName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_,
					oldImageAssetsRepositoryName_java_lang_String_, imageAssetsRepositoryName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifier_java_lang_String_() {
		return qualifier_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifier_java_lang_String_(String newQualifier_java_lang_String_) {
		String oldQualifier_java_lang_String_ = qualifier_java_lang_String_;
		qualifier_java_lang_String_ = newQualifier_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_,
					oldQualifier_java_lang_String_, qualifier_java_lang_String_));
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
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_:
			return getAssetPublishingExternalId_java_lang_String_();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_:
			return getAssetPublishingRoleArn_java_lang_String_();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_:
			return getCloudFormationExecutionRole_java_lang_String_();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			return getDeployRoleArn_java_lang_String_();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_:
			return getFileAssetsBucketName_java_lang_String_();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_:
			return getImageAssetsRepositoryName_java_lang_String_();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_:
			return getQualifier_java_lang_String_();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_:
			setAssetPublishingExternalId_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_:
			setAssetPublishingRoleArn_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_:
			setCloudFormationExecutionRole_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			setDeployRoleArn_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_:
			setFileAssetsBucketName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_:
			setImageAssetsRepositoryName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_:
			setQualifier_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_:
			setAssetPublishingExternalId_java_lang_String_(ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_:
			setAssetPublishingRoleArn_java_lang_String_(ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_:
			setCloudFormationExecutionRole_java_lang_String_(CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			setDeployRoleArn_java_lang_String_(DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_:
			setFileAssetsBucketName_java_lang_String_(FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_:
			setImageAssetsRepositoryName_java_lang_String_(IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_:
			setQualifier_java_lang_String_(QUALIFIER_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING_:
			return ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT == null
					? assetPublishingExternalId_java_lang_String_ != null
					: !ASSET_PUBLISHING_EXTERNAL_ID_JAVA_LANG_STRING__EDEFAULT
							.equals(assetPublishingExternalId_java_lang_String_);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING_:
			return ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT == null
					? assetPublishingRoleArn_java_lang_String_ != null
					: !ASSET_PUBLISHING_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT
							.equals(assetPublishingRoleArn_java_lang_String_);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING_:
			return CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING__EDEFAULT == null
					? cloudFormationExecutionRole_java_lang_String_ != null
					: !CLOUD_FORMATION_EXECUTION_ROLE_JAVA_LANG_STRING__EDEFAULT
							.equals(cloudFormationExecutionRole_java_lang_String_);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__DEPLOY_ROLE_ARN_JAVA_LANG_STRING_:
			return DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT == null ? deployRoleArn_java_lang_String_ != null
					: !DEPLOY_ROLE_ARN_JAVA_LANG_STRING__EDEFAULT.equals(deployRoleArn_java_lang_String_);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING_:
			return FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT == null
					? fileAssetsBucketName_java_lang_String_ != null
					: !FILE_ASSETS_BUCKET_NAME_JAVA_LANG_STRING__EDEFAULT
							.equals(fileAssetsBucketName_java_lang_String_);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING_:
			return IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT == null
					? imageAssetsRepositoryName_java_lang_String_ != null
					: !IMAGE_ASSETS_REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT
							.equals(imageAssetsRepositoryName_java_lang_String_);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__QUALIFIER_JAVA_LANG_STRING_:
			return QUALIFIER_JAVA_LANG_STRING__EDEFAULT == null ? qualifier_java_lang_String_ != null
					: !QUALIFIER_JAVA_LANG_STRING__EDEFAULT.equals(qualifier_java_lang_String_);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.DEFAULT_STACK_SYNTHESIZER_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (assetPublishingExternalId_java_lang_String_: ");
		result.append(assetPublishingExternalId_java_lang_String_);
		result.append(", assetPublishingRoleArn_java_lang_String_: ");
		result.append(assetPublishingRoleArn_java_lang_String_);
		result.append(", cloudFormationExecutionRole_java_lang_String_: ");
		result.append(cloudFormationExecutionRole_java_lang_String_);
		result.append(", deployRoleArn_java_lang_String_: ");
		result.append(deployRoleArn_java_lang_String_);
		result.append(", fileAssetsBucketName_java_lang_String_: ");
		result.append(fileAssetsBucketName_java_lang_String_);
		result.append(", imageAssetsRepositoryName_java_lang_String_: ");
		result.append(imageAssetsRepositoryName_java_lang_String_);
		result.append(", qualifier_java_lang_String_: ");
		result.append(qualifier_java_lang_String_);
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

} //DefaultStackSynthesizerBuilder_coreImpl
