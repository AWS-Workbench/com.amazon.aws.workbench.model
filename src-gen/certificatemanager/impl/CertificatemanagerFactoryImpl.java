/**
 */
package certificatemanager.impl;

import certificatemanager.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CertificatemanagerFactoryImpl extends EFactoryImpl implements CertificatemanagerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CertificatemanagerFactory init() {
		try {
			CertificatemanagerFactory theCertificatemanagerFactory = (CertificatemanagerFactory) EPackage.Registry.INSTANCE
					.getEFactory(CertificatemanagerPackage.eNS_URI);
			if (theCertificatemanagerFactory != null) {
				return theCertificatemanagerFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CertificatemanagerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CertificatemanagerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CertificatemanagerPackage.CERTIFICATE_BUILDER_CERTIFICATEMANAGER:
			return createCertificateBuilder_certificatemanager();
		case CertificatemanagerPackage.DNS_VALIDATED_CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER:
			return createDnsValidatedCertificatePropsBuilder_certificatemanager();
		case CertificatemanagerPackage.CERTIFICATE_PROPS_BUILDER_CERTIFICATEMANAGER:
			return createCertificatePropsBuilder_certificatemanager();
		case CertificatemanagerPackage.DNS_VALIDATED_CERTIFICATE_BUILDER_CERTIFICATEMANAGER:
			return createDnsValidatedCertificateBuilder_certificatemanager();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case CertificatemanagerPackage.VALIDATION_METHOD:
			return createValidationMethodFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case CertificatemanagerPackage.VALIDATION_METHOD:
			return convertValidationMethodToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificateBuilder_certificatemanager createCertificateBuilder_certificatemanager() {
		CertificateBuilder_certificatemanagerImpl certificateBuilder_certificatemanager = new CertificateBuilder_certificatemanagerImpl();
		return certificateBuilder_certificatemanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsValidatedCertificatePropsBuilder_certificatemanager createDnsValidatedCertificatePropsBuilder_certificatemanager() {
		DnsValidatedCertificatePropsBuilder_certificatemanagerImpl dnsValidatedCertificatePropsBuilder_certificatemanager = new DnsValidatedCertificatePropsBuilder_certificatemanagerImpl();
		return dnsValidatedCertificatePropsBuilder_certificatemanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificatePropsBuilder_certificatemanager createCertificatePropsBuilder_certificatemanager() {
		CertificatePropsBuilder_certificatemanagerImpl certificatePropsBuilder_certificatemanager = new CertificatePropsBuilder_certificatemanagerImpl();
		return certificatePropsBuilder_certificatemanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DnsValidatedCertificateBuilder_certificatemanager createDnsValidatedCertificateBuilder_certificatemanager() {
		DnsValidatedCertificateBuilder_certificatemanagerImpl dnsValidatedCertificateBuilder_certificatemanager = new DnsValidatedCertificateBuilder_certificatemanagerImpl();
		return dnsValidatedCertificateBuilder_certificatemanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationMethod createValidationMethodFromString(EDataType eDataType, String initialValue) {
		ValidationMethod result = ValidationMethod.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValidationMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CertificatemanagerPackage getCertificatemanagerPackage() {
		return (CertificatemanagerPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CertificatemanagerPackage getPackage() {
		return CertificatemanagerPackage.eINSTANCE;
	}

} //CertificatemanagerFactoryImpl
