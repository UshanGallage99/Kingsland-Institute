package bo;

import bo.custom.impl.CourseBOImpl;
import bo.custom.impl.RegistrationBOImpl;
import bo.custom.impl.StudentBOImpl;

public class BOFactory {
        private static BOFactory boFactory;

        private BOFactory() {
        }

        public static BOFactory getInstance() {
            return (boFactory == null) ?
                    (boFactory = new BOFactory()) : (boFactory);
        }

        public enum BOType {
            STUDENT,COURSE,REGISTRATION
        }

        public <T> T getBo(BOType type) {
            switch (type) {
                case STUDENT:
                    return (T) new StudentBOImpl();
                case COURSE:
                    return (T) new CourseBOImpl();
                case REGISTRATION:
                    return (T) new RegistrationBOImpl();
                default:
                    return null;
            }
        }

    }


