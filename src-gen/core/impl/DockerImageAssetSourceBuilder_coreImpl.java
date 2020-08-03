/**
 */
package core.impl;

import core.CorePackage;
import core.DockerImageAssetSourceBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Image Asset Source Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getDirectoryName_java_lang_String_ <em>Directory Name java lang String </em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getSourceHash_java_lang_String_ <em>Source Hash java lang String </em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getDockerBuildArgs_java_lang_String__java_lang_String_AsMap <em>Docker Build Args java lang String java lang String As Map</em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getDockerBuildTarget_java_lang_String_ <em>Docker Build Target java lang String </em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getDockerFile_java_lang_String_ <em>Docker File java lang String </em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.DockerImageAssetSourceBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerImageAssetSourceBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements DockerImageAssetSourceBuilder_core {
	/**
	 * The default value of the '{@link #getDirectoryName_java_lang_String_() <em>Directory Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTORY_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirectoryName_java_lang_String_() <em>Directory Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectoryName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String directoryName_java_lang_String_ = DIRECTORY_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceHash_java_lang_String_() <em>Source Hash java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHash_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_HASH_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceHash_java_lang_String_() <em>Source Hash java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceHash_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String sourceHash_java_lang_String_ = SOURCE_HASH_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerBuildArgs_java_lang_String__java_lang_String_AsMap() <em>Docker Build Args java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerBuildArgs_java_lang_String__java_lang_String_AsMap() <em>Docker Build Args java lang String java lang String As Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerBuildArgs_java_lang_String__java_lang_String_AsMap()
	 * @generated
	 * @ordered
	 */
	protected String dockerBuildArgs_java_lang_String__java_lang_String_AsMap = DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerBuildTarget_java_lang_String_() <em>Docker Build Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerBuildTarget_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_BUILD_TARGET_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerBuildTarget_java_lang_String_() <em>Docker Build Target java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerBuildTarget_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String dockerBuildTarget_java_lang_String_ = DOCKER_BUILD_TARGET_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getDockerFile_java_lang_String_() <em>Docker File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerFile_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCKER_FILE_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDockerFile_java_lang_String_() <em>Docker File java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDockerFile_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String dockerFile_java_lang_String_ = DOCKER_FILE_JAVA_LANG_STRING__EDEFAULT;

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
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.DockerImageAssetSource";

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
	protected DockerImageAssetSourceBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDirectoryName_java_lang_String_() {
		return directoryName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirectoryName_java_lang_String_(String newDirectoryName_java_lang_String_) {
		String oldDirectoryName_java_lang_String_ = directoryName_java_lang_String_;
		directoryName_java_lang_String_ = newDirectoryName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_,
					oldDirectoryName_java_lang_String_, directoryName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceHash_java_lang_String_() {
		return sourceHash_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceHash_java_lang_String_(String newSourceHash_java_lang_String_) {
		String oldSourceHash_java_lang_String_ = sourceHash_java_lang_String_;
		sourceHash_java_lang_String_ = newSourceHash_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_,
					oldSourceHash_java_lang_String_, sourceHash_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerBuildArgs_java_lang_String__java_lang_String_AsMap() {
		return dockerBuildArgs_java_lang_String__java_lang_String_AsMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerBuildArgs_java_lang_String__java_lang_String_AsMap(
			String newDockerBuildArgs_java_lang_String__java_lang_String_AsMap) {
		String oldDockerBuildArgs_java_lang_String__java_lang_String_AsMap = dockerBuildArgs_java_lang_String__java_lang_String_AsMap;
		dockerBuildArgs_java_lang_String__java_lang_String_AsMap = newDockerBuildArgs_java_lang_String__java_lang_String_AsMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP,
					oldDockerBuildArgs_java_lang_String__java_lang_String_AsMap,
					dockerBuildArgs_java_lang_String__java_lang_String_AsMap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerBuildTarget_java_lang_String_() {
		return dockerBuildTarget_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerBuildTarget_java_lang_String_(String newDockerBuildTarget_java_lang_String_) {
		String oldDockerBuildTarget_java_lang_String_ = dockerBuildTarget_java_lang_String_;
		dockerBuildTarget_java_lang_String_ = newDockerBuildTarget_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_,
					oldDockerBuildTarget_java_lang_String_, dockerBuildTarget_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDockerFile_java_lang_String_() {
		return dockerFile_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDockerFile_java_lang_String_(String newDockerFile_java_lang_String_) {
		String oldDockerFile_java_lang_String_ = dockerFile_java_lang_String_;
		dockerFile_java_lang_String_ = newDockerFile_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_,
					oldDockerFile_java_lang_String_, dockerFile_java_lang_String_));
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
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_,
					oldRepositoryName_java_lang_String_, repositoryName_java_lang_String_));
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
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_:
			return getDirectoryName_java_lang_String_();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_:
			return getSourceHash_java_lang_String_();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return getDockerBuildArgs_java_lang_String__java_lang_String_AsMap();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_:
			return getDockerBuildTarget_java_lang_String_();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_:
			return getDockerFile_java_lang_String_();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			return getRepositoryName_java_lang_String_();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_:
			setDirectoryName_java_lang_String_((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_:
			setSourceHash_java_lang_String_((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setDockerBuildArgs_java_lang_String__java_lang_String_AsMap((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_:
			setDockerBuildTarget_java_lang_String_((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_:
			setDockerFile_java_lang_String_((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			setRepositoryName_java_lang_String_((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_:
			setDirectoryName_java_lang_String_(DIRECTORY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_:
			setSourceHash_java_lang_String_(SOURCE_HASH_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			setDockerBuildArgs_java_lang_String__java_lang_String_AsMap(
					DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_:
			setDockerBuildTarget_java_lang_String_(DOCKER_BUILD_TARGET_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_:
			setDockerFile_java_lang_String_(DOCKER_FILE_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			setRepositoryName_java_lang_String_(REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DIRECTORY_NAME_JAVA_LANG_STRING_:
			return DIRECTORY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? directoryName_java_lang_String_ != null
					: !DIRECTORY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(directoryName_java_lang_String_);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__SOURCE_HASH_JAVA_LANG_STRING_:
			return SOURCE_HASH_JAVA_LANG_STRING__EDEFAULT == null ? sourceHash_java_lang_String_ != null
					: !SOURCE_HASH_JAVA_LANG_STRING__EDEFAULT.equals(sourceHash_java_lang_String_);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP:
			return DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT == null
					? dockerBuildArgs_java_lang_String__java_lang_String_AsMap != null
					: !DOCKER_BUILD_ARGS_JAVA_LANG_STRING_JAVA_LANG_STRING_AS_MAP_EDEFAULT
							.equals(dockerBuildArgs_java_lang_String__java_lang_String_AsMap);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_BUILD_TARGET_JAVA_LANG_STRING_:
			return DOCKER_BUILD_TARGET_JAVA_LANG_STRING__EDEFAULT == null ? dockerBuildTarget_java_lang_String_ != null
					: !DOCKER_BUILD_TARGET_JAVA_LANG_STRING__EDEFAULT.equals(dockerBuildTarget_java_lang_String_);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__DOCKER_FILE_JAVA_LANG_STRING_:
			return DOCKER_FILE_JAVA_LANG_STRING__EDEFAULT == null ? dockerFile_java_lang_String_ != null
					: !DOCKER_FILE_JAVA_LANG_STRING__EDEFAULT.equals(dockerFile_java_lang_String_);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			return REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? repositoryName_java_lang_String_ != null
					: !REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(repositoryName_java_lang_String_);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.DOCKER_IMAGE_ASSET_SOURCE_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (directoryName_java_lang_String_: ");
		result.append(directoryName_java_lang_String_);
		result.append(", sourceHash_java_lang_String_: ");
		result.append(sourceHash_java_lang_String_);
		result.append(", dockerBuildArgs_java_lang_String__java_lang_String_AsMap: ");
		result.append(dockerBuildArgs_java_lang_String__java_lang_String_AsMap);
		result.append(", dockerBuildTarget_java_lang_String_: ");
		result.append(dockerBuildTarget_java_lang_String_);
		result.append(", dockerFile_java_lang_String_: ");
		result.append(dockerFile_java_lang_String_);
		result.append(", repositoryName_java_lang_String_: ");
		result.append(repositoryName_java_lang_String_);
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

} //DockerImageAssetSourceBuilder_coreImpl
