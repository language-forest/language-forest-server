CREATE TABLE IF NOT EXISTS google_user_info (
  uid BINARY(16) NOT NULL,
  created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  deleted_at DATETIME NULL,
  google_id VARCHAR(50) NOT NULL,
  email VARCHAR(100) NULL,
  name VARCHAR(50) NULL,
  picture VARCHAR(100) NULL,
  locale VARCHAR(11) NULL,
  CONSTRAINT pk_google_user_info PRIMARY KEY (uid),
  CONSTRAINT uc_google_user_info_googleid UNIQUE (google_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;;

CREATE TABLE IF NOT EXISTS user (
  id BINARY(16) NOT NULL,
  created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  deleted_at DATETIME NULL,
  email VARCHAR(100) NULL,
  username VARCHAR(50) DEFAULT NULL,
  birthday DATE DEFAULT NULL,
  gender ENUM('MALE', 'FEMALE', 'OTHER') DEFAULT NULL,
  language ENUM('EN', 'KO') NOT NULL,
  CONSTRAINT pk_user PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;;


-- 유저 학습 언어 테이블 생성
CREATE TABLE IF NOT EXISTS user_study_language (
  id BINARY(16) NOT NULL,
  uid BINARY(16) NOT NULL,
  language ENUM('EN', 'KO') NOT NULL,
  level ENUM('EASY', 'NORMAL', 'HARD') NOT NULL,
  purpose VARCHAR(255) DEFAULT NULL,

  created_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  updated_at DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  deleted_at DATETIME NULL,

  CONSTRAINT pk_user_study_language PRIMARY KEY (id)
  INDEX idx_user_study_language_uid (uid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
