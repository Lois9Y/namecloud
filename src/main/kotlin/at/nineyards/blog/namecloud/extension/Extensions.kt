package at.nineyards.blog.namecloud.extension

import org.springframework.core.ParameterizedTypeReference

inline fun <reified T: Any> typeRef(): ParameterizedTypeReference<T> = object: ParameterizedTypeReference<T>(){}
