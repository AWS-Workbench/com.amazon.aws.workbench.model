/**
 */
package com.amazon.aws.workbench.model.awsworkbench.impl;

import com.amazon.aws.workbench.model.awsworkbench.AwsworkbenchPackage;
import com.amazon.aws.workbench.model.awsworkbench.RedirectProtocol;
import com.amazon.aws.workbench.model.awsworkbench.RedirectTargetBuilder_s3;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Redirect Target Builder s3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RedirectTargetBuilder_s3Impl#getHostName_java_lang_String_ <em>Host Name java lang String </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RedirectTargetBuilder_s3Impl#getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RedirectTargetBuilder_s3Impl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RedirectTargetBuilder_s3Impl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RedirectTargetBuilder_s3Impl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.amazon.aws.workbench.model.awsworkbench.impl.RedirectTargetBuilder_s3Impl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RedirectTargetBuilder_s3Impl extends MinimalEObjectImpl.Container implements RedirectTargetBuilder_s3 {
	/**
	 * The default value of the '{@link #getHostName_java_lang_String_() <em>Host Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_NAME_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostName_java_lang_String_() <em>Host Name java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostName_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String hostName_java_lang_String_ = HOST_NAME_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_() <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_()
	 * @generated
	 * @ordered
	 */
	protected static final RedirectProtocol PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT = RedirectProtocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_() <em>Protocol software amazon awscdk services s3 Redirect Protocol </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_()
	 * @generated
	 * @ordered
	 */
	protected RedirectProtocol protocol_software_amazon_awscdk_services_s3_RedirectProtocol_ = PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.s3.RedirectTarget";

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
	protected RedirectTargetBuilder_s3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsworkbenchPackage.Literals.REDIRECT_TARGET_BUILDER_S3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHostName_java_lang_String_() {
		return hostName_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHostName_java_lang_String_(String newHostName_java_lang_String_) {
		String oldHostName_java_lang_String_ = hostName_java_lang_String_;
		hostName_java_lang_String_ = newHostName_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_,
					oldHostName_java_lang_String_, hostName_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RedirectProtocol getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_() {
		return protocol_software_amazon_awscdk_services_s3_RedirectProtocol_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_(
			RedirectProtocol newProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_) {
		RedirectProtocol oldProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ = protocol_software_amazon_awscdk_services_s3_RedirectProtocol_;
		protocol_software_amazon_awscdk_services_s3_RedirectProtocol_ = newProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_ == null
				? PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT
				: newProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_,
					oldProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_,
					protocol_software_amazon_awscdk_services_s3_RedirectProtocol_));
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
					AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__VAR_NAME, oldVarName, varName));
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
					AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__IDENTIFIER, oldIdentifier, identifier));
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
					AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__ADDITIONAL_CODE, oldAdditionalCode,
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
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			return getHostName_java_lang_String_();
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			return getProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_();
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__VAR_NAME:
			return getVarName();
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__IDENTIFIER:
			return getIdentifier();
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			setHostName_java_lang_String_((String) newValue);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_((RedirectProtocol) newValue);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__VAR_NAME:
			setVarName((String) newValue);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			setHostName_java_lang_String_(HOST_NAME_JAVA_LANG_STRING__EDEFAULT);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			setProtocol_software_amazon_awscdk_services_s3_RedirectProtocol_(
					PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__ADDITIONAL_CODE:
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
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__HOST_NAME_JAVA_LANG_STRING_:
			return HOST_NAME_JAVA_LANG_STRING__EDEFAULT == null ? hostName_java_lang_String_ != null
					: !HOST_NAME_JAVA_LANG_STRING__EDEFAULT.equals(hostName_java_lang_String_);
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL_:
			return protocol_software_amazon_awscdk_services_s3_RedirectProtocol_ != PROTOCOL_SOFTWARE_AMAZON_AWSCDK_SERVICES_S3_REDIRECT_PROTOCOL__EDEFAULT;
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case AwsworkbenchPackage.REDIRECT_TARGET_BUILDER_S3__ADDITIONAL_CODE:
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
		result.append(" (hostName_java_lang_String_: ");
		result.append(hostName_java_lang_String_);
		result.append(", protocol_software_amazon_awscdk_services_s3_RedirectProtocol_: ");
		result.append(protocol_software_amazon_awscdk_services_s3_RedirectProtocol_);
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

} //RedirectTargetBuilder_s3Impl
