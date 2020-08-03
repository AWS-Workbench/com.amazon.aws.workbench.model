/**
 */
package certificatemanager.util;

import certificatemanager.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see certificatemanager.CertificatemanagerPackage
 * @generated
 */
public class CertificatemanagerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CertificatemanagerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificatemanagerSwitch() {
		if (modelPackage == null) {
			modelPackage = CertificatemanagerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case CertificatemanagerPackage.CERTIFICATE_BUILDER_CERTIFICATEMANAGER: {
			CertificateBuilder_certificatemanager certificateBuilder_certificatemanager = (CertificateBuilder_certificatemanager) theEObject;
			T result = caseCertificateBuilder_certificatemanager(certificateBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CertificatemanagerPackage.DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER: {
			DnsValidatedCertificatePropsBuilder_certificatemanager dnsValidatedCertificatePropsBuilder_certificatemanager = (DnsValidatedCertificatePropsBuilder_certificatemanager) theEObject;
			T result = caseDnsValidatedCertificatePropsBuilder_certificatemanager(
					dnsValidatedCertificatePropsBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER: {
			CertificatePropsBuilder_certificatemanager certificatePropsBuilder_certificatemanager = (CertificatePropsBuilder_certificatemanager) theEObject;
			T result = caseCertificatePropsBuilder_certificatemanager(certificatePropsBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case CertificatemanagerPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER: {
			DnsValidatedCertificateBuilder_certificatemanager dnsValidatedCertificateBuilder_certificatemanager = (DnsValidatedCertificateBuilder_certificatemanager) theEObject;
			T result = caseDnsValidatedCertificateBuilder_certificatemanager(
					dnsValidatedCertificateBuilder_certificatemanager);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Builder certificatemanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificateBuilder_certificatemanager(CertificateBuilder_certificatemanager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dns Validated Certificate Props Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dns Validated Certificate Props Builder certificatemanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDnsValidatedCertificatePropsBuilder_certificatemanager(
			DnsValidatedCertificatePropsBuilder_certificatemanager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Certificate Props Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Certificate Props Builder certificatemanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCertificatePropsBuilder_certificatemanager(CertificatePropsBuilder_certificatemanager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dns Validated Certificate Builder certificatemanager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDnsValidatedCertificateBuilder_certificatemanager(
			DnsValidatedCertificateBuilder_certificatemanager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CertificatemanagerSwitch
