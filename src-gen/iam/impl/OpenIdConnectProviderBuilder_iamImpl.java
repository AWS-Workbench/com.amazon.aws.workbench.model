/**
 */
package iam.impl;

import iam.IamPackage;
import iam.OpenIdConnectProviderBuilder_iam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Open Id Connect Provider Builder iam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl#getUrl_java_lang_String_ <em>Url java lang String </em>}</li>
 *   <li>{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl#getClientIds_java_lang_String_AsList <em>Client Ids java lang String As List</em>}</li>
 *   <li>{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl#getThumbprints_java_lang_String_AsList <em>Thumbprints java lang String As List</em>}</li>
 *   <li>{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl#getGeneratedClassName <em>Generated Class Name</em>}</li>
 *   <li>{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link iam.impl.OpenIdConnectProviderBuilder_iamImpl#getAdditionalCode <em>Additional Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OpenIdConnectProviderBuilder_iamImpl extends MinimalEObjectImpl.Container
		implements OpenIdConnectProviderBuilder_iam {
	/**
	 * The default value of the '{@link #getUrl_java_lang_String_() <em>Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_JAVA_LANG_STRING__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl_java_lang_String_() <em>Url java lang String </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl_java_lang_String_()
	 * @generated
	 * @ordered
	 */
	protected String url_java_lang_String_ = URL_JAVA_LANG_STRING__EDEFAULT;

	/**
	 * The default value of the '{@link #getClientIds_java_lang_String_AsList() <em>Client Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClientIds_java_lang_String_AsList() <em>Client Ids java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientIds_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String clientIds_java_lang_String_AsList = CLIENT_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getThumbprints_java_lang_String_AsList() <em>Thumbprints java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbprints_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected static final String THUMBPRINTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThumbprints_java_lang_String_AsList() <em>Thumbprints java lang String As List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThumbprints_java_lang_String_AsList()
	 * @generated
	 * @ordered
	 */
	protected String thumbprints_java_lang_String_AsList = THUMBPRINTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratedClassName() <em>Generated Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneratedClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATED_CLASS_NAME_EDEFAULT = "software.amazon.awscdk.services.iam.OpenIdConnectProvider";

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
	protected OpenIdConnectProviderBuilder_iamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IamPackage.Literals.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUrl_java_lang_String_() {
		return url_java_lang_String_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUrl_java_lang_String_(String newUrl_java_lang_String_) {
		String oldUrl_java_lang_String_ = url_java_lang_String_;
		url_java_lang_String_ = newUrl_java_lang_String_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_, oldUrl_java_lang_String_,
					url_java_lang_String_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClientIds_java_lang_String_AsList() {
		return clientIds_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClientIds_java_lang_String_AsList(String newClientIds_java_lang_String_AsList) {
		String oldClientIds_java_lang_String_AsList = clientIds_java_lang_String_AsList;
		clientIds_java_lang_String_AsList = newClientIds_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST,
					oldClientIds_java_lang_String_AsList, clientIds_java_lang_String_AsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getThumbprints_java_lang_String_AsList() {
		return thumbprints_java_lang_String_AsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThumbprints_java_lang_String_AsList(String newThumbprints_java_lang_String_AsList) {
		String oldThumbprints_java_lang_String_AsList = thumbprints_java_lang_String_AsList;
		thumbprints_java_lang_String_AsList = newThumbprints_java_lang_String_AsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST,
					oldThumbprints_java_lang_String_AsList, thumbprints_java_lang_String_AsList));
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
					IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME, oldVarName, varName));
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
					IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER, oldIdentifier, identifier));
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
					IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE, oldAdditionalCode,
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
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_:
			return getUrl_java_lang_String_();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST:
			return getClientIds_java_lang_String_AsList();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST:
			return getThumbprints_java_lang_String_AsList();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__GENERATED_CLASS_NAME:
			return getGeneratedClassName();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME:
			return getVarName();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER:
			return getIdentifier();
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_:
			setUrl_java_lang_String_((String) newValue);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST:
			setClientIds_java_lang_String_AsList((String) newValue);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST:
			setThumbprints_java_lang_String_AsList((String) newValue);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME:
			setVarName((String) newValue);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER:
			setIdentifier((String) newValue);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_:
			setUrl_java_lang_String_(URL_JAVA_LANG_STRING__EDEFAULT);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST:
			setClientIds_java_lang_String_AsList(CLIENT_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST:
			setThumbprints_java_lang_String_AsList(THUMBPRINTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME:
			setVarName(VAR_NAME_EDEFAULT);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER:
			setIdentifier(IDENTIFIER_EDEFAULT);
			return;
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE:
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
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__URL_JAVA_LANG_STRING_:
			return URL_JAVA_LANG_STRING__EDEFAULT == null ? url_java_lang_String_ != null
					: !URL_JAVA_LANG_STRING__EDEFAULT.equals(url_java_lang_String_);
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__CLIENT_IDS_JAVA_LANG_STRING_AS_LIST:
			return CLIENT_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? clientIds_java_lang_String_AsList != null
					: !CLIENT_IDS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(clientIds_java_lang_String_AsList);
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__THUMBPRINTS_JAVA_LANG_STRING_AS_LIST:
			return THUMBPRINTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT == null ? thumbprints_java_lang_String_AsList != null
					: !THUMBPRINTS_JAVA_LANG_STRING_AS_LIST_EDEFAULT.equals(thumbprints_java_lang_String_AsList);
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__GENERATED_CLASS_NAME:
			return GENERATED_CLASS_NAME_EDEFAULT == null ? generatedClassName != null
					: !GENERATED_CLASS_NAME_EDEFAULT.equals(generatedClassName);
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__VAR_NAME:
			return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__IDENTIFIER:
			return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
		case IamPackage.OPEN_ID_CONNECT_PROVIDER_BUILDER_IAM__ADDITIONAL_CODE:
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
		result.append(" (url_java_lang_String_: ");
		result.append(url_java_lang_String_);
		result.append(", clientIds_java_lang_String_AsList: ");
		result.append(clientIds_java_lang_String_AsList);
		result.append(", thumbprints_java_lang_String_AsList: ");
		result.append(thumbprints_java_lang_String_AsList);
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

} //OpenIdConnectProviderBuilder_iamImpl
