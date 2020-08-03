/**
 */
package core.impl;

import core.CorePackage;
import core.DockerImageAssetLocationBuilder_core;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Docker Image Asset Location Builder core</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.DockerImageAssetLocationBuilder_coreImpl#getImageUri_java_lang_String_ <em>Image Uri java lang String </em>}</li>
 *   <li>{@link core.impl.DockerImageAssetLocationBuilder_coreImpl#getRepositoryName_java_lang_String_ <em>Repository Name java lang String </em>}</li>
 *   <li>{@link core.impl.DockerImageAssetLocationBuilder_coreImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link core.impl.DockerImageAssetLocationBuilder_coreImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link core.impl.DockerImageAssetLocationBuilder_coreImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link core.impl.DockerImageAssetLocationBuilder_coreImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DockerImageAssetLocationBuilder_coreImpl extends MinimalEObjectImpl.Container
		implements DockerImageAssetLocationBuilder_core {
	/**
	 * The default value of the '{@link #getImageUri_java_lang_String_() <em>Image Uri java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUri_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URI_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUri_java_lang_String_() <em>Image Uri java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUri_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String imageUri_java_lang_String_ = IMAGE_URI_JAVA_LANG_STRING__EDEFAULT;

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
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.core.DockerImageAssetLocation";

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
	protected DockerImageAssetLocationBuilder_coreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImageUri_java_lang_String_() {
		return imageUri_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImageUri_java_lang_String_(String newImageUri_java_lang_String_) {
		String oldImageUri_java_lang_String_ = imageUri_java_lang_String_;
		imageUri_java_lang_String_ = newImageUri_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_,
					oldImageUri_java_lang_String_, imageUri_java_lang_String_));
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
					CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_,
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
					CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME, oldVarName, varName));
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
					CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER, oldIdentifier, identifier));
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
					CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE, oldAdditionalCode,
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
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_:
			return getImageUri_java_lang_String_();
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			return getRepositoryName_java_lang_String_();
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			return getVarName();
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			return getIdentifier();
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_:
			setImageUri_java_lang_String_((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			setRepositoryName_java_lang_String_((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			setVarName((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_:
			setImageUri_java_lang_String_(IMAGE_URI_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			setRepositoryName_java_lang_String_(REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IMAGE_URI_JAVA_LANG_STRING_:
			return IMAGE_URI_JAVA_LANG_STRING__EDEFAULT == null ? imageUri_java_lang_String_ != null
					: !IMAGE_URI_JAVA_LANG_STRING__EDEFAULT.equals(imageUri_java_lang_String_);
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__REPOSITORY_NAME_JAVA_LANG_STRING_:
			return REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT == null ? repositoryName_java_lang_String_ != null
					: !REPOSITORY_NAME_JAVA_LANG_STRING__EDEFAULT.equals(repositoryName_java_lang_String_);
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case CorePackage.DOCKER_IMAGE_ASSET_LOCATION_BUILDER_CORE__ADDITIONAL_CODE:
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
		result.append(" (imageUri_java_lang_String_: ");
		result.append(imageUri_java_lang_String_);
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

} //DockerImageAssetLocationBuilder_coreImpl
