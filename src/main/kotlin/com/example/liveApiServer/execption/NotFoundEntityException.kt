package com.example.liveApiServer.execption

import com.example.liveApiServer.dto.error.MSAServerErrorDetails
import com.example.liveApiServer.enum.MSAServerErrorCode
import org.springframework.http.HttpStatus

class NotFoundEntityException(
    errorDetails: MSAServerErrorDetails
): BusinessException(MSAServerErrorCode.INVALID_ID, errorDetails)